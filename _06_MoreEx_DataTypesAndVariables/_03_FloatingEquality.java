package _06_MoreEx_DataTypesAndVariables;

import java.util.Scanner;

public class _03_FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double eps = 0.000001;
        double f1 = Double.parseDouble(scanner.nextLine());
        double f2 = Double.parseDouble(scanner.nextLine());

        // final float PRECISION_LEVEL = 0.000001f;
        boolean isEqual = Math.abs(f1 - f2) < eps;
        if (isEqual) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}
