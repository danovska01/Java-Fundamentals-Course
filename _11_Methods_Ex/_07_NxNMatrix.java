package _11_Methods_Ex;

import java.util.Scanner;

public class _07_NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write a method that receives a single integer n and prints nxn matrix with that number.
        int n = Integer.parseInt(scanner.nextLine());
        nxnMatrix(n);
    }

    private static void nxnMatrix(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(n + " ");
            }
            System.out.println();

        }
    }
}
