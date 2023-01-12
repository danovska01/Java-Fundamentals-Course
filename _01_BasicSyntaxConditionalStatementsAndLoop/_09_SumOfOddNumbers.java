package _01_BasicSyntaxConditionalStatementsAndLoop;

import java.util.Scanner;

public class _09_SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= Integer.parseInt(scanner.nextLine());
        int sum= 0;
        for (int i=0; i<(2*n); i++){
            if (i%2!=0){
                System.out.println(i);
                sum+=n;
            }

        }
        System.out.printf("Sum: %d", sum);
    }
}
