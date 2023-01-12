package _04_DataTypesAndVariables;

import java.util.Scanner;

public class _12_RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int checkedNum = 1; checkedNum <= number; checkedNum++) {
            int currentNum = checkedNum;
            while (currentNum > 0) {
                sum += currentNum % 10;
                currentNum = currentNum / 10;
            }
            boolean isSpecial = (sum == 5) || (sum == 7) || (sum == 11);
            if (isSpecial) {
                System.out.printf("%d -> True%n", checkedNum);
            }
            else {
                System.out.printf("%d -> False%n", checkedNum);
            }

            sum = 0;
        }
    }
}
