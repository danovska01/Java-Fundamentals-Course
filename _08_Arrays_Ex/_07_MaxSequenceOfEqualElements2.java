package _08_Arrays_Ex;

import java.util.Arrays;
import java.util.Scanner;

public class _07_MaxSequenceOfEqualElements2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int [] array = Arrays.stream(scanner.nextLine()
                .split(" ")).mapToInt(Integer::parseInt).toArray();

        int maxCounts = 0;
        int keepFirstIndex = 0;
        int keepSecondIndex = 0;

        int index = 0;

        while(index < array.length - 1 ) {
            int secondIndex = index + 1;

            int counter = 1;
            while(secondIndex < array.length && array[secondIndex] == array[index]){
                counter++;
                secondIndex++;
            }
            if(counter > maxCounts) {
                maxCounts = counter;
                keepFirstIndex = index;
                keepSecondIndex = secondIndex;
            }
            index = secondIndex;
        }
        for ( index = keepFirstIndex; index < keepSecondIndex ; index++) {
            System.out.print(array[index] + " ");
        }
    }
    }
