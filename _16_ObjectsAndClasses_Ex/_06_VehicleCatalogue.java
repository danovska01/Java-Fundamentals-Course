package _16_ObjectsAndClasses_Ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _06_VehicleCatalogue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        List<Vehicle> vehicleList = new ArrayList<>();

        String input = scanner.nextLine();
        while(!input.equals("End")) {
            Vehicle currentVehicle = new Vehicle (input.split(" ")[0], input.split(" ")[1], input.split(" ")[2], Integer.parseInt(input.split(" ")[3]));
            vehicleList.add(currentVehicle);
            input= scanner.nextLine();
        }
        String input2= scanner.nextLine();
        while (!input2.equals("Close the Catalogue")){
            String modelRequested= input2;
            for(Vehicle x: vehicleList){
                if(x.getModel().equals(modelRequested)){
                    System.out.println(x.getInfo());
                }
            }
            input2= scanner.nextLine();
        }
        double averageHpCars= getAverageHpCars(vehicleList);
        double averageHpTrucks= getAverageHpTruck(vehicleList);
        System.out.printf("Cars have average horsepower of: %.2f.%n", averageHpCars);
        System.out.printf("Trucks have average horsepower of: %.2f.", averageHpTrucks);
    }

    private static double getAverageHpTruck(List<Vehicle> vehicleList) {
        int indexTruck= 0;
        double sum= 0;
        for(Vehicle vehicle : vehicleList){
             if (vehicle.getType().equals("Truck") || vehicle.getType().equals("truck")){
                indexTruck++;
                int currentTruckHp= vehicle.getHorsePower();
                sum+=currentTruckHp;
            }

        }
        if (indexTruck==0){
            return 0;
        }
        return sum/indexTruck;
    }

    private static double getAverageHpCars(List<Vehicle> vehicleList) {
        int indexCar= 0;
        double sum= 0;
        for(Vehicle vehicle : vehicleList){
            if(vehicle.getType().equals("Car") || vehicle.getType().equals("car")){
                indexCar++;
                int currentCarHp= vehicle.getHorsePower();
                sum+=currentCarHp;

            }

        }
        if (indexCar==0){
            return 0;
        }

        return sum/indexCar;
    }



    public static class Vehicle {
        private String type;
        private String model;
        private String color;
        private int horsePower;

        public String getModel() {
            return model;
        }
        public String getType() {
            return type;
        }public String getColor() {
            return model;
        }
        public int getHorsePower() {
            return horsePower;
        }

        public String getInfo(){
            if(getType().equals("car")){
                this.type="Car";
            }
            if(getType().equals("truck")){
                this.type="Truck";
            }
            String result = String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %d", type, model, color, horsePower);
            return result;

        }

        public Vehicle(String type, String model, String color, int horsePower) {
            this.type = type;
            this.model=model;
            this.color=color;
            this.horsePower=horsePower;
        }
    }


}
