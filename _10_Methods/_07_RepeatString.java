package _10_Methods;

import java.util.Scanner;

public class _07_RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write a method that receives a string and a repeat count n (integer).
        // The method should return a new string (the old one repeated n times).

        String input = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        String repeated= repeatString (input, count);
        System.out.println(repeated);
    }

    private static String repeatString(String input, int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result=result+input;
        }
        return result;
    }
}
