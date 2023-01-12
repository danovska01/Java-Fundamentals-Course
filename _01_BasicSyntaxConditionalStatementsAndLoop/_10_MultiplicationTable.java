package _01_BasicSyntaxConditionalStatementsAndLoop;

import java.util.Scanner;

public class _10_MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int x=1; x<=10; x++){
            System.out.printf("%d X %d = %d%n", n, x, n*x);

        }
    }
}
