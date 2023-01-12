package _01_BasicSyntaxConditionalStatementsAndLoop;

import java.util.Scanner;

public class _11_MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int theInteger = Integer.parseInt(scanner.nextLine());
        int multiplier = Integer.parseInt(scanner.nextLine());

        if ( multiplier>10){
            System.out.printf("%d X %d = %d%n", theInteger, multiplier, theInteger*multiplier);
        }
        else {
            for (int x=multiplier; x<=10; x++){
                System.out.printf("%d X %d = %d%n", theInteger, x, theInteger*x);

            }
        }

    }
}
