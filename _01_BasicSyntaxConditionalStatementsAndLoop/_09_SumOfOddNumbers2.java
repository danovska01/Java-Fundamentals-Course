package _01_BasicSyntaxConditionalStatementsAndLoop;

import java.util.Scanner;

public class _09_SumOfOddNumbers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int oddNumberFound= 0;
        int number= 1;

        while (oddNumberFound<n){
            if (number%2!=0){
                System.out.println(number);
                oddNumberFound++;
            }
            number++;

        }

    }
}
