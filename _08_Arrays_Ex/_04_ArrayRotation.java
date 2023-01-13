package _08_Arrays_Ex;

import java.util.Scanner;

public class _04_ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write a program that receives an array and number of rotations you have to perform
        // (first element goes at the end) Print the resulting array.
        // Input: 51 47 32 61 21
        //    2

        String arr []= scanner.nextLine().split(" ");
        int rotations = Integer.parseInt(scanner.nextLine());
        int iterations = rotations % arr.length;
        for (int i = 0; i < iterations; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                String current = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = current;
            }

        }
        for(String i: arr){
            System.out.print(i + " ");
        }






    }
}
