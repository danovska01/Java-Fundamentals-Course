package _10_Methods;

import java.util.Scanner;

public class _06_CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Create a method that calculates and returns the area of a rectangle by given width and length.

        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double area = getRectangleArea (width,height);
        System.out.printf("%.0f", area);
    }

    private static double getRectangleArea(double width, double height) {
        double rectangleArea = width * height;
        return rectangleArea;
    }
}
