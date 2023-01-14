package _10_Methods;

import java.util.Scanner;

public class _04_Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write a program that receives a string on the first line ("add", "multiply", "subtract", "divide")
        // and on the next two lines receives two numbers. Create four methods (for each calculation)
        // and invoke the right one depending on the command. The method should also print the result
        // (needs to be void).

        String input = scanner.nextLine();
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        switch (input){
            case "add":
                addNumbers (num1, num2);
                break;
            case "multiply":
                multiplyNumbers (num1, num2);
                break;
            case "subtract":
                subtractNumbers (num1, num2);
                break;
            case "divide":
                divideNumbers (num1, num2);
                break;


        }


    }

    private static void divideNumbers(int num1, int num2) {
        int divide = num1/num2;
        System.out.println(divide);
    }

    private static void subtractNumbers(int num1, int num2) {
        int subtract = num1-num2;
        System.out.println(subtract);
    }

    private static void multiplyNumbers(int num1, int num2) {
        int multiply = num1*num2;
        System.out.println(multiply);
    }

    private static void addNumbers(int num1, int num2) {
        int sum= num1+num2;
        System.out.println(sum);
    }


}
