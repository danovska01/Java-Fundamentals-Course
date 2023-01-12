package _01_BasicSyntaxConditionalStatementsAndLoop;

import java.util.Scanner;

public class _13_RefactorSumOfOddNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum=0;
        int oddNumFound=0;

        for (int i = 1; oddNumFound<n; i++){
            if (i%2!=0){
                System.out.println(i);
                oddNumFound++;
                sum+=i;
            }
        }
        System.out.printf("Sum: %d", sum);

    }
}
