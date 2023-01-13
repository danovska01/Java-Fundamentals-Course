package _07_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class _06_EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read two arrays and print on the console whether they are identical or not. Arrays are identical if
        // their elements are equal. If the arrays are identical find the sum of the first one and print on the console
        // following message: "Arrays are identical. Sum: {sum}", otherwise find the first index where the arrays differ
        // and print on the console following message: "Arrays are not identical. Found difference at {index} index."

        int[] firstArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int[] secondArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        // Iterate through arrays and compare element. If the elements are not equal print the required message and break the loop.
        int maxlength = firstArr.length;
        int sum = 0;
        boolean notIdentical = false;

        for (int i = 0; i < maxlength; i++) {
            sum += firstArr[i];
            if (firstArr[i] != secondArr[i]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                notIdentical = true;
                break;
            }
        }
        if (!notIdentical) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }

}

