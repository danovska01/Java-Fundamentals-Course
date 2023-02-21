package _19_Associative_Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> airplanes = new HashMap<>();

        airplanes.put(scanner.nextLine(), Integer.valueOf(scanner.nextLine()));
        airplanes.put(scanner.nextLine(), Integer.valueOf(scanner.nextLine()));
        airplanes.put(scanner.nextLine(), Integer.valueOf(scanner.nextLine()));


        /*airplanes.remove("Boeing 737");
        System.out.println(airplanes.containsValue(130));
        System.out.println(airplanes.containsValue(100));
        if (airplanes.containsKey("Boeing 2"))
            System.out.println("It exists");*/
        for(Map.Entry<String, Integer> entry: airplanes.entrySet()){
            System.out.println("K: " + entry.getKey());
            System.out.println("V: " + entry.getValue());
        }
    }
}
