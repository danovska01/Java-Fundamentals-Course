package _13_Lists_Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _04_ListManipulationBasics2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

                List< Integer> list = Arrays
                        .stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());
                String command = scanner.nextLine();

                while(!command.equals("end")){
                    List<String>currentList = Arrays.stream(command.split(" "))
                            .collect(Collectors.toList());
                    if(command.contains("Add")){
                        list.add(Integer.parseInt(currentList.get(1)));
                    }else if(command.contains("Remove ")){
                        list.remove(Integer.valueOf(Integer.parseInt(currentList.get(1))));
                    }else if(command.contains("RemoveAt")){
                        list.remove(Integer.parseInt(currentList.get(1)));
                    }else if(command.contains("Insert")){
                        int index = Integer.parseInt(currentList.get(2));
                        int number = Integer.parseInt(currentList.get(1));
                        list.add(index, number);
                    }
                    command = scanner.nextLine();

                }
                System.out.println(list.toString().replaceAll("[\\[\\],]", ""));
            }
        }

