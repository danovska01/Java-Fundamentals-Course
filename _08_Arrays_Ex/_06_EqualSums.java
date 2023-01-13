package _08_Arrays_Ex;

import java.util.Arrays;
import java.util.Scanner;

public class _06_EqualSums {
    public static void main(String[] args) {
        // Write a program that determines if there exists an element in the array such that the sum of
        // the elements on its left is equal to the sum of the elements on its right.
        // input: 1 1 1 2 3 1 3 3
        Scanner scanner = new Scanner(System.in);
        int inputNumbers[] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        boolean equal= false;
        int currentIndex = 0;

        for (int indeX = 0; indeX < inputNumbers.length; indeX++) {
            int currentElement = inputNumbers[indeX];
            int sumLeft = 0;
            int sumRight = 0;

            for (int leftIndex = 0; leftIndex < indeX; leftIndex++) {
                sumLeft += inputNumbers[leftIndex];
            }
            for (int rightIndex = indeX+1 ; rightIndex < inputNumbers.length; rightIndex++) {
                sumRight += inputNumbers[rightIndex];
            }
            if (sumLeft==sumRight) {
                equal= true;
                currentIndex=indeX;
                break;
            }


        }
        if (equal){
            System.out.print(currentIndex + " ");
        }
        else {
            System.out.println("no");
        }


    }

}


