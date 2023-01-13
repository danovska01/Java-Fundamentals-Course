package _07_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _03_SumEvenNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        String nums [] = text.split(" ");
        int arr [] = new int [nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = Integer.parseInt(nums[i]);
        }
        int evenSum = 0;
        for(int i : arr){
            if(i % 2 == 0){
                evenSum += i;
            }
        };
        System.out.println(evenSum);
    }
}
