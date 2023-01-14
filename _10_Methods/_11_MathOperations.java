package _10_Methods;

import java.util.Scanner;

public class _11_MathOperations {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        //Write a method that receives two numbers and an operator, calculates the
        // result and returns it. You will be given three lines of input.
        // 5
        // *
        // 5

        double num1= Double.parseDouble(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);
        double num2= Double.parseDouble(scanner.nextLine());

        double result = getResult(num1, operator, num2);
        System.out.printf("%.0f", result);


    }

    private static double getResult(double num1, char operator, double num2) {
        double outcome= 0;
        if (operator=='/'){
            outcome=num1/num2;
        }
        else if (operator=='*'){
            outcome=num1*num2;
        }
        else if (operator=='+'){
            outcome=num1+num2;
        }
        else if (operator=='-'){
            outcome=num1-num2;
        }
        return outcome;
    }
}
