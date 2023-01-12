package _01_BasicSyntaxConditionalStatementsAndLoop;

import java.util.Scanner;

public class _01_StudentInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String studentName = scanner.nextLine();
        int studentAge = Integer.parseInt(scanner.nextLine());
        double studentGrade = Double.parseDouble(scanner.nextLine());
        System.out.printf("Name: %s, Age: %d, Grade: %.2f", studentName, studentAge, studentGrade);


    }
}
