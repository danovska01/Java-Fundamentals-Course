package _14_Lists_Ex;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _01_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // On the first line you will be given a list of wagons (integers). Each integer represents the number of
        // passengers that are currently in each wagon. On the next line you will get the max capacity of each
        // wagon (single integer). Until you receive "end" you will be given two types of input:
        // Add {passengers} or {passengers}

        String input = scanner.nextLine();
        List<Integer> listNumbers = Arrays.stream(input.split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int maxCapacityOfWagon = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            List<String> tokens = Arrays.stream(command.split(" ")).collect(Collectors.toList());

            if (tokens.contains("Add")) {      //add a wagon to the end with the given number of passengers
                int waggonToAdd = Integer.parseInt(tokens.get(1));
                listNumbers.add(waggonToAdd);
            }

            else { // {passengers} -  find an existing wagon to fit all the passengers (starting from the first wagon)
                int passangersleft = Integer.parseInt(command);

                for (int i = 0; i < listNumbers.size(); i++) {
                    int currentNumberPassangersInWagon = listNumbers.get(i);
                    int sitsAvailable = maxCapacityOfWagon - currentNumberPassangersInWagon;

                    if (passangersleft <= sitsAvailable) {
                        listNumbers.set(i, (currentNumberPassangersInWagon + passangersleft));
                        i--;
                        break;
                    }

                }
            }
            command = scanner.nextLine();
        }

        for (int number : listNumbers) {
            System.out.print(number + " ");
        }
        // System.out.println(list.toString().replaceAll("[\\[\\],]", ""));

    }


}

