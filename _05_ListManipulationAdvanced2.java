package _13_Lists_Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _05_ListManipulationAdvanced2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                List<Integer> list = Arrays.stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());
                String command = scanner.nextLine();
                while(!command.equals("end")) {
                    String separated[] = command.split(" ");

                    if (command.contains("Contains")) {
                        isContains(list, Integer.parseInt(separated[1]));
                    } else if (command.equals("Print even")) {
                        printEvenOrOdd(list, false);
                    } else if (command.equals("Print odd")) {
                        printEvenOrOdd(list, true);
                    }else if(command.equals("Get sum")){
                        getSum(list);
                    }else if(command.contains("Filter")){
                        filter(list, separated[1], Integer.parseInt(separated[2]));
                    }





                    command = scanner.nextLine();
                }
            }

            static void isContains(List<Integer> list, int num){
                boolean check = list.contains(num);
                if(check){
                    System.out.println("Yes");
                }else{
                    System.out.println("No such number");
                }
            }

            static void printEvenOrOdd (List <Integer> list, boolean isOdd){
                String is = "" + isOdd;
                switch (is){
                    case "true":
                        for (int i = 0; i < list.size(); i++) {
                            int currentNum = list.get(i);
                            if(currentNum % 2 != 0){
                                System.out.print(currentNum);
                                if(i != list.size()-1){
                                    System.out.print(" ");
                                }
                            }
                        }
                        System.out.println();
                        break;
                    case "false":
                        for (int i = 0; i < list.size(); i++) {
                            int currentNum = list.get(i);
                            if(currentNum % 2 == 0){
                                System.out.print(currentNum);
                                if(i != list.size()-1){
                                    System.out.print(" ");
                                }
                            }
                        }
                        System.out.println();
                        break;
                    default:
                        break;
                }
            }

            static void getSum(List <Integer>list){
                int sum = 0;
                for (int i = 0; i < list.size(); i++) {
                    sum += list.get(i);
                }
                System.out.println(sum);
            }


            static void filter(List<Integer>list, String operator, int number){
                for (int i = 0; i < list.size(); i++) {
                    switch (operator){
                        case "<":
                            if(list.get(i) < number){
                                System.out.print(list.get(i));
                                if(i != list.size()-1){
                                    System.out.print(" ");
                                }
                            }
                            break;
                        case ">":
                            if(list.get(i) > number){
                                System.out.print(list.get(i));
                                if(i != list.size()-1){
                                    System.out.print(" ");
                                }
                            }
                            break;
                        case ">=":
                            if(list.get(i) >= number){
                                System.out.print(list.get(i));
                                if(i != list.size()-1){
                                    System.out.print(" ");
                                }
                            }
                            break;
                        case "<=":
                            if(list.get(i) <= number){
                                System.out.print(list.get(i));
                                if(i != list.size()-1){
                                    System.out.print(" ");
                                }
                            }
                            break;
                    }
                }
                System.out.println();

            }

        }

