package _11_Methods_Ex;

import java.util.Scanner;

public class _08_FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read two integer numbers. Calculate factorial of each number.
        // Divide the first result by the second and print the division formatted to the second decimal point.

        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());

        double factorialA= factorial(a);
        double factorialB= factorial(b);
        double dividedResult = factorialA/factorialB;
        System.out.printf("%.2f", dividedResult);
    }

    private static double factorial(double number) {
        double result=1;
        for (int i = 1; i <=number; i++) {
            result= result*i;
        }
        return result;
    }
}
