package _08_Arrays_Ex;

import java.util.Arrays;
import java.util.Scanner;

public class _08_MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write a program, which prints all unique pairs in an array of integers whose sum is equal to a given number.
// input 14 20 60 13 7 19 8
//27
        int [] arrayNumbers = Arrays.stream(scanner.nextLine()
                .split(" ")).mapToInt(Integer::parseInt).toArray();
        int magicNumber = Integer.parseInt(scanner.nextLine());

        for(int index1 = 0; index1< arrayNumbers.length-1; index1++){
            for(int index2 = index1+1; index2< arrayNumbers.length; index2++) {
                if(arrayNumbers[index1] + arrayNumbers[index2] == magicNumber){
                    System.out.println(arrayNumbers[index1] + " " + arrayNumbers[index2]);
                }
            }

        }

    }
}
