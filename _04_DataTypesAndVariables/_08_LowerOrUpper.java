package _04_DataTypesAndVariables;

import java.util.Scanner;

public class _08_LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write a program that prints whether a given character is upper-case or lower-case.

        char symbol = scanner.nextLine().charAt(0);

        if (Character.isUpperCase(symbol)){
            System.out.println("upper-case");
        }
        else if (Character.isLowerCase(symbol)){
            System.out.println("lower-case");
        }



    }
}
