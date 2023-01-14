package _10_Methods;

import java.util.Scanner;

public class _10_MultiplyEvensByOdds {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Create a program that reads an integer number and multiplies
        // the sum of all its even digits by the sum of all its odd digits:

        int number = Integer.parseInt(scanner.nextLine());
        int multipleOfEvensAndOdds= getMultipleOfEvensAndOdds(number);
        System.out.println(multipleOfEvensAndOdds);
    }

    private static int getMultipleOfEvensAndOdds(int number) {
        int sumEven = getSumEven(number);
        int sumOdd = getSumOdd(number);
        int multiple= sumEven*sumOdd;
        return multiple;
    }

    private static int getSumOdd(int number) {
        number = Math.abs(number);
        int sumOdd=0;
        while(number>0){
            int digit = number%10;
        if (digit%2==1){
            sumOdd+=digit;
        }
        number/=10;
        }
        return sumOdd;
    }

    private static int getSumEven(int number) {
        number = Math.abs(number);
        int sumEven=0;
        while(number>0){
            int digit = number%10;
            if (digit%2==0){
                sumEven+=digit;
            }
            number/=10;
        }
        return sumEven;
    }
}
