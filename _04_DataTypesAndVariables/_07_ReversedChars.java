package _04_DataTypesAndVariables;

import java.util.Scanner;

public class _07_ReversedChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Write a program that takes 3 lines of characters and prints them in reversed order with a space between them.
        char a = scanner.nextLine().charAt(0);
        char b = scanner.nextLine().charAt(0);
        char c = scanner.nextLine().charAt(0);
        String text = "";
        text+=c + " ";
        text+=b + " ";
        text+=a + " ";

        System.out.println(text);


    }
}
