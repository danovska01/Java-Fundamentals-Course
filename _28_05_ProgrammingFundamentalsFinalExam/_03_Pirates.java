package _28_05_ProgrammingFundamentalsFinalExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _03_Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,Integer> populationOfCities = new LinkedHashMap<>();
        Map<String,Integer> goldOfCities = new LinkedHashMap<>();
        String [] text = scanner.nextLine().split("\\|\\|");
        while (!text[0].equals("Sail")){
            String city= text[0];
            int population = Integer.parseInt(text[1]);
            int gold = Integer.parseInt(text[2]);
            if(populationOfCities.containsKey(city)){
                populationOfCities.put(city, populationOfCities.get(city)+population);
                goldOfCities.put(city, goldOfCities.get(city)+gold);
            }
            populationOfCities.putIfAbsent(city, population);
            goldOfCities.putIfAbsent(city, gold);

            text=scanner.nextLine().split("\\|\\|");
        }
        String [] command = scanner.nextLine().split("=>");
        while (!command[0].equals("End")){

            switch (command[0]){


                case"Plunder":
                    //Plunder=>{town}=>{people}=>{gold}
                    String townToPlunder= command[1];
                    int peopleToPlunder= Integer.parseInt(command[2]);
                    int goldToPlunder= Integer.parseInt(command[3]);


                    if(populationOfCities.containsKey(townToPlunder)){
                        populationOfCities.put(townToPlunder, populationOfCities.get(townToPlunder)-peopleToPlunder);
                        goldOfCities.put(townToPlunder, goldOfCities.get(townToPlunder)-goldToPlunder);
                        System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", townToPlunder, goldToPlunder, peopleToPlunder);
                    }
                    if(populationOfCities.get(townToPlunder)<=0 || goldOfCities.get(townToPlunder)<=0){
                        populationOfCities.remove(townToPlunder);
                        goldOfCities.remove(townToPlunder);
                        System.out.printf("%s has been wiped off the map!%n", townToPlunder);

                    }
                    break;
                case"Prosper":
                    //"Prosper=>{town}=>{gold}"
                    String townToProsper = command[1];
                    if(goldOfCities.containsKey(townToProsper)){
                    int gold = Integer.parseInt(command[2]);
                    if(gold<0){
                        System.out.println("Gold added cannot be a negative number!");
                        break;
                    }
                    else {
                        goldOfCities.put(townToProsper, goldOfCities.get(townToProsper)+gold);

                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n", gold, townToProsper, goldOfCities.get(townToProsper));

                    }}

                    break;
                default:
                    break;

            }



            command=scanner.nextLine().split("=>");
        }
        if(goldOfCities.size()>0){
        System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", populationOfCities.size());
        populationOfCities.entrySet().stream()
                .forEach(entry -> System.out.println(String.format("%s -> Population: %d citizens, Gold: %d kg", entry.getKey(), entry.getValue(), goldOfCities.get(entry.getKey() ))));
    }
        else {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }
    }
}
