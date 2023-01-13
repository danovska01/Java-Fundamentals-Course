package _06_MoreEx_DataTypesAndVariables;

import java.util.Scanner;

public class _04_RefactoringPrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number= Integer.parseInt(scanner.nextLine());

        for (int currentNumber = 2; currentNumber <= number; currentNumber++) {
            int counter=0;
            for (int i = 1; i <= currentNumber; i++) {
                if (currentNumber % i == 0) {
                    counter++;
                }

                }
            if (counter==2){
                System.out.printf("%d -> true%n", currentNumber);
            }
            else {
                System.out.printf("%d -> false%n", currentNumber);
            }
            counter=0;
        }
    }
}
