package _08_Arrays_Ex;

import java.util.Arrays;
import java.util.Scanner;

public class _05_TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write a program to find all the top integers in an array.
        // A top integer is an integer which is bigger than all the elements to its right.
        // Input: 1 2 3 3

        /*String [] input = scanner.nextLine().split(" ");
        int [] inputNumbers = new int [input.length];
        for (int i = 0; i < input.length; i++) {
            // ////////        inputNumbers [i] = Integer.parseInt(input[i]);
            int number = Integer.parseInt(input[i]);
            inputNumbers[i]=number;
        }*/
         int inputNumbers [] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        for (int i = 0; i < inputNumbers.length - 1; i++) {
            boolean notTopInteger = false;
            for (int j = i + 1; j < inputNumbers.length; j++) {
                if(inputNumbers[i] <= inputNumbers[j]){
                    notTopInteger = true;
                    break;
                }
            }
            if(!notTopInteger){
                System.out.print(inputNumbers[i] + " ");
            }
        }
        System.out.print(inputNumbers[inputNumbers.length-1]);


    }
}
