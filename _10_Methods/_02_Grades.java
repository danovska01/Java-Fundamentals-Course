package _10_Methods;

import java.util.Scanner;

public class _02_Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write a method that receives a grade between 2.00 and 6.00 and prints the corresponding grade in words:
        double grade = Double.parseDouble(scanner.nextLine());
        GradeChecker(grade);
    }

    private static void GradeChecker(double grade) {
        if (grade>=2.00 && grade<= 2.99 ){
            System.out.println("Fail");
        }
        else if (grade>=3.00 && grade<= 3.49 ){
            System.out.println("Poor");
        }
        else if (grade>=3.50 && grade<= 4.49 ){
            System.out.println("Good");
        }
        else if (grade>=4.50 && grade<= 5.49 ){
            System.out.println("Very good");
        }
        else if (grade>=5.50 && grade<= 6 ){
            System.out.println("Excellent");
        }
    }
}
