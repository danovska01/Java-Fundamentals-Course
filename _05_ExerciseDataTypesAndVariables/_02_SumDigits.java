package _05_ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class _02_SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        int checkNumber = number;
        while (checkNumber>0){
            int digit = checkNumber%10;
            sum+=digit;
            checkNumber/=10;
        }
        System.out.println(sum);



    }
}
