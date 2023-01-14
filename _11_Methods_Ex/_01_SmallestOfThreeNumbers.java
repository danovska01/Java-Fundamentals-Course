package _11_Methods_Ex;

import java.util.Scanner;

public class _01_SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write a method to print the smallest of three integer numbers. Use appropriate name for the method.
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        getSmallestNum(a,b, c);
    }

    private static void getSmallestNum(int a, int b, int c) {

        if (a<b && a<c){
            System.out.println(a);
        }
        else if (b<a && b<c){
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }

    }
}
