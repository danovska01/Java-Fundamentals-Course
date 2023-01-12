package _04_DataTypesAndVariables;

import java.util.Scanner;

public class _02_PoundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1 British Pound = 1.36 Dollars

        double dollars = Double.parseDouble(scanner.nextLine());
        double pounds = 1.36*dollars;

        System.out.printf("%.3f", pounds);
    }
}
