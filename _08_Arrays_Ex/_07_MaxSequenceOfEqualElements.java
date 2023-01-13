package _08_Arrays_Ex;

import java.util.Arrays;
import java.util.Scanner;

public class _07_MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write a program that finds the longest sequence of equal elements in an array of integers.
        // If several longest sequences exist, print the leftmost one.
        // input: 11 1 1 2 3 1 3 3


        int arr [] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int startIndex = 0;
        int count = 1;
        int maxConsequence = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] == arr[i + 1]){
                count++;
            }else{
                count = 1;
            }
            if(maxConsequence < count){
                maxConsequence = count;
                startIndex = i - (count - 2);
            }
        }
        for (int i = startIndex; i < startIndex + maxConsequence; i++) {
            System.out.print(arr [i] + " ");
        }

    }
}
