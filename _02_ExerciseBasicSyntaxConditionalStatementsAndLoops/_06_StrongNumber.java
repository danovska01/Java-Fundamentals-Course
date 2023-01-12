package _02_ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class _06_StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // A numberChosen is strong if the sum of the Factorial of each digit is equal to the numberChosen.
        // For example 145 is a strong numberChosen, because 1! + 4! + 5! = 145.

        int factorail= 1;
        int factorailSum=0;

        int number = Integer.parseInt(scanner.nextLine());
        int numberChosen=number;
        while (numberChosen!=0){
            int lastDigit = numberChosen%10;
            for(int i=1;i<=lastDigit; i++ ){
                factorail*=i;
            }
            factorailSum+=factorail;
            factorail=1;
            numberChosen=numberChosen/10;
        }

        if (factorailSum==number){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }

    }
}
