package _10_Methods;

import java.util.Scanner;

public class _01_SignOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Create a method that prints the sign of an integer number.

        int input = Integer.parseInt(scanner.nextLine());
        numberCheck (input);
    }

    private static void numberCheck(int input) {
        if (input>0){
            System.out.printf("The number %d is positive.", input);
        }
        else if (input<0){
            System.out.printf("The number %d is negative.", input);
        }
        else if (input==0){
            System.out.printf("The number %d is zero.", input);
        }
    }
}
