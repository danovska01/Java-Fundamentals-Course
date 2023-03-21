package _28_03_ProgrammingFundamentalsFinalExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _03_NeedForSpeedIII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> mileageList= new LinkedHashMap<>();
        Map<String, Integer> fuelList= new LinkedHashMap<>();


        while (n-->0){
            //{car}|{mileage}|{fuel}
            String [] characteristics= scanner.nextLine().split("\\|");
            String car = characteristics[0];
            int mileage = Integer.parseInt(characteristics[1]);
            int fuel = Integer.parseInt(characteristics[2]);
            mileageList.putIfAbsent(car, mileage);
            fuelList.putIfAbsent(car, fuel);
        }
        String [] commands = scanner.nextLine().split(" : ");
        while (!commands[0].equals("Stop")){
            String car = commands[1];
        switch (commands[0]){

            case "Drive":
                //"Drive : {car} : {distance} : {fuel}":
                int distance = Integer.parseInt(commands[2]);
                int fuel = Integer.parseInt(commands[3]);
                if(fuelList.get(car)<fuel){
                    System.out.println("Not enough fuel to make that ride");
                }
                else {
                    int newFuelBalance= fuelList.get(car)-fuel;
                    int newMileage= mileageList.get(car)+distance;
                    System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", car,distance,fuel);
                    fuelList.put(car, newFuelBalance);
                    mileageList.put(car, newMileage);
                }
                if(mileageList.get(car)>=100000){
                    System.out.printf("Time to sell the %s!%n", car);
                    fuelList.remove(car);
                    mileageList.remove(car);
                }
                break;
            case "Refuel":
                //"Refuel : {car} : {fuel}":
                int fuelToRefillOffered = Integer.parseInt(commands[2]);
                int currentFuelInTank= fuelList.get(car);
                if(currentFuelInTank+fuelToRefillOffered<=75){
                    fuelList.put(car, currentFuelInTank+fuelToRefillOffered);
                    System.out.printf("%s refueled with %d liters%n", car, fuelToRefillOffered);
                }
                else {
                    fuelList.put(car,75);
                    System.out.printf("%s refueled with %d liters%n", car, 75-currentFuelInTank);
                }

                break;
            case "Revert":
                //Revert : {car} : {kilometers}
                int kilometers= Integer.parseInt(commands[2]);
                mileageList.put(car, mileageList.get(car)-kilometers);
                if(mileageList.get(car)<10000){
                    mileageList.put(car, 10000);
                }
                else {
                    System.out.printf("%s mileage decreased by %d kilometers%n", car, kilometers);
                }
                break;

        }

            commands = scanner.nextLine().split(" : ");
        }
        fuelList.entrySet().stream()
                .forEach(entry -> System.out.println(String.format("%s -> Mileage: %d kms, Fuel in the tank: %d lt.", entry.getKey(), mileageList.get(entry.getKey()), entry.getValue()) ));
    }
}
