package _10_Methods;

import java.util.Scanner;

public class _03_PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Create a method for printing triangles

        int height = Integer.parseInt(scanner.nextLine());
        printPyramid (height);

    }

    private static void printPyramid(int height) {
        printTopHalf(height);
        printBottomHalf(height);
    }


    private static void printTopHalf(int height) {
        for (int i = 1; i < height; i++) {
            printSingleLine(i);
        }
    }

    private static void printBottomHalf(int height) {
        for (int i = height; i >= 1; i--) {
            printSingleLine(i);
        }
    }
    private static void printSingleLine(int length) {
        for (int i = 1; i <= length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


}
