package _11_Methods_Ex;

import java.util.Scanner;

public class _06_MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // You will receive a single string. Write a method that prints the middle character.
        // If the length of the string is even, there are two middle characters.
        String input = scanner.nextLine();
        middleSymbol(input);

    }

    private static void middleSymbol(String input) {
        if (input.length()%2==0){
            System.out.print(input.charAt(input.length()/2-1));
            System.out.print(input.charAt(input.length()/2));
        }
        else {
            System.out.print(input.charAt(input.length()/2));
        }
    }
}
