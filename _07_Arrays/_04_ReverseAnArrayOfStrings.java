package _07_Arrays;

import java.util.Scanner;

public class _04_ReverseAnArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write a program to read an array of strings, reverse it and print its elements.
        // The input consists of a sequence of space separated strings.
        // Print the output on a single line (space separated).

        String input = scanner.nextLine();
        String [] items = input.split(" ");
        for (int i = items.length-1; i>=0; i--){
            System.out.print(items[i]+ " ");
        }
    }
}
