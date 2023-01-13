package _07_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _05_EvenAndOddSubstraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write a program that calculates the difference between the sum of the even and the
        // sum of the odd numbers in an array.

     int [] numbers = Arrays
             .stream(scanner.nextLine().split(" "))
             .mapToInt(e->Integer.parseInt(e))
             .toArray();

     int evenSum=0;
     int oddSum=0;

     for (int number: numbers){
         if (number%2==0){
             evenSum+=number;
         }
         else {
             oddSum+=number;
         }
     }
     int diff = evenSum-oddSum;
        System.out.println(diff);


    }

}
