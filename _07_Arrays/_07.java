package _07_Arrays;

import java.util.Scanner;

public class _07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String numbers [] = input.split(" ");

        int arrayOfNumbers [] = new int [numbers.length];
        for (int i=0; i<numbers.length; i++){
            arrayOfNumbers[i]=Integer.parseInt(numbers[i]);
        }

        while (arrayOfNumbers.length>1){
            int arrayCondensed [] = new int[arrayOfNumbers.length-1];
            for (int i = 0; i < arrayOfNumbers.length-1; i++) {
                arrayCondensed[i] = arrayOfNumbers[i] + arrayOfNumbers[i+1];
            }
            arrayOfNumbers = new int[arrayCondensed.length];
            for (int i = 0; i < arrayOfNumbers.length; i++) {
                arrayOfNumbers[i] = arrayCondensed[i];
            }


        }
        System.out.println(arrayOfNumbers[0]);


    }
}
