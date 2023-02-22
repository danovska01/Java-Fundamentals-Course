package _20_Associative_Arrays_Ex;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class _04_SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        Map<String, String> register = new LinkedHashMap<>();
        for (int i = 1; i<=number; i++){
            String [] input = scanner.nextLine().split(" ");
            String command = input[0];
            String userName = input[1];

            switch (command){
                case "register":
                    String plateNumber = input[2];
                    if(!register.containsKey(userName)){
                        register.put(userName, plateNumber);
                        System.out.println(userName+ " registered " + plateNumber + " successfully");
                    }
                    else {
                        System.out.println("ERROR: already registered with plate number "+ plateNumber);
                    }
                    break;
                case "unregister":
                    if(!register.containsKey(userName)){
                        System.out.println("ERROR: user " + userName+ " not found");
                    }
                    else {
                        register.remove(userName);
                        System.out.println(userName+ " unregistered successfully");
                    }
                    break;

            }
        }
        for (Map.Entry<String, String> entry : register.entrySet()) {
            System.out.printf("%s => %s%n", entry.getKey(), entry.getValue());
        }
    }
}
