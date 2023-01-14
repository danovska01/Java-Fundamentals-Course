package _10_Methods;

import java.util.Scanner;

public class _09_GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // You are given two values of the same type as input. The values can be of type int, char of String.
        // Create a method getMax() that returns the greater of the two values:


                String input = sc.nextLine();
                switch(input){
                    case "int":
                        int first = Integer.parseInt(sc.nextLine());
                        int second = Integer.parseInt(sc.nextLine());
                        System.out.println(getBigger(first, second));
                        break;
                    case "char":
                        char firstChar = (char)sc.nextLine().charAt(0);
                        char secondChar = (char)sc.nextLine().charAt(0);
                        System.out.println(getBigger(firstChar, secondChar));
                        break;
                    case "string":
                        String stringOne = sc.nextLine();
                        String stringSecond = sc.nextLine();
                        System.out.println(getBigger(stringOne, stringSecond));
                        break;
                    default:
                        break;
                }
            }
            static int getBigger(int first, int second){
                if(first >= second){
                    return first;
                }else{
                    return second;
                }
            }
            static char getBigger(char first, char second){
                if(first >= second){
                    return first;
                }else{
                    return second;
                }
            }
            static String getBigger(String first, String second){
                if(first.compareTo(second) >= 0){
                    return first;
                }else{
                    return second;
                }
            }
        }

