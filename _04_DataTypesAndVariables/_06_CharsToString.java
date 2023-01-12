package _04_DataTypesAndVariables;

import java.util.Scanner;

public class _06_CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write a program that reads 3 lines of input.
        // On each line, you get a single character. Combine all the characters into one
        // string and print it on the console.

        char a = scanner.nextLine().charAt(0);
        char b = scanner.nextLine().charAt(0);
        char c = scanner.nextLine().charAt(0);
        String text = "";
        text+=a;
        text+=b;
        text+=c;

        System.out.println(text);

    }
}
