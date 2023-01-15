package _12_Methods_More_Ex;

import java.util.Scanner;

public class _04_TribonacciSequence {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        // In the "Tribonacci" sequence, every number is formed by the sum of the previous 3.
        //You are given a number num. Write a program that prints num numbers from the Tribonacci sequence,
        // each on a new line, starting from 1. The input comes as a parameter named num. The value num will
        // always be positive integer.

        int length = Integer.parseInt(scanner.nextLine());
        int [] tribonacci = new int[Math.max(length,3)];
        getTribonacciNumbers(tribonacci);

        for (int i = 0; i < length; i++) // <-
        {
            System.out.print(tribonacci[i] + " ");
        }

    }

    private static void getTribonacciNumbers(int[] tribonacci)
    {
        //Декларирам си първите 3 стойности на масива
        tribonacci[0] = tribonacci[1] = 1;
        tribonacci[2] = 2;

        //Започвам да пълня масива от 4-тата му стойност, защото предходните 3 са запълнени
        for (int i = 3; i < tribonacci.length; i++)
        {
            //Използвам формулата на Tribbonacci

            tribonacci[i] = tribonacci[i - 1] +
                    tribonacci[i - 2] +
                    tribonacci[i - 3];
        }
    }

}
