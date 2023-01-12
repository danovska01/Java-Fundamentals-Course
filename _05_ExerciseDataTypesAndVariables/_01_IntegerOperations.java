package _05_ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class _01_IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1= Integer.parseInt(scanner.nextLine());
        int x2= Integer.parseInt(scanner.nextLine());
        int x3= Integer.parseInt(scanner.nextLine());
        int x4= Integer.parseInt(scanner.nextLine());
        double result = ((x1+x2)*1.0/x3)*x4;
        System.out.printf("%.0f", result);
    }
}
