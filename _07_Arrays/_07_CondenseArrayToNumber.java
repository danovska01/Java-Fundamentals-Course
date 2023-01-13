package _07_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _07_CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write a program to read an array of integers and condense them by summing adjacent couples of elements
        // until a single integer is obtained.

        // For example, if we have 3 elements {2, 10, 3}, we sum the first two and the second two elements and
        // obtain {2+10, 10+3} = {12, 13}, then we sum again all adjacent elements and obtain {12+13} = {25}.

        int arr[] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        while (arr.length > 1) {
            int currentArr[] = new int[arr.length - 1];
            for (int i = 0; i < arr.length - 1; i++) {
                currentArr[i] = arr[i] + arr[i + 1];
            }
            arr = new int[currentArr.length];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = currentArr[i];
            }

        }

        System.out.println(arr[0]);


    }


}

