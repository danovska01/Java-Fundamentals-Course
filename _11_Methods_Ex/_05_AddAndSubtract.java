package _11_Methods_Ex;

import java.util.Scanner;

public class _05_AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // You will receive 3 integers. Write a method sum to get the sum of the first two integers and
        // subtract method that subtracts the third integer from the result from the sum method.

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        int sumFirstTwoNumbers= sum(a,b);
        int subtract= subtract (sumFirstTwoNumbers, c);
        System.out.println(subtract);
    }

    private static int subtract(int sumFirstTwoNumbers, int c) {
        int subtract = sumFirstTwoNumbers-c;
        return subtract;
    }

    private static int sum(int a, int b) {
        int sum= a+b;
        return  sum;
    }
}
