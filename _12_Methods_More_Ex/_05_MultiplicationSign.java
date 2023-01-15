package _12_Methods_More_Ex;

import java.util.Scanner;

public class _05_MultiplicationSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //You are given a number num1, num2 and num3. Write a program that finds if num1 * num2 * num3
        // (the product) is negative, positive or zero. Try to do this WITHOUT multiplying the 3 numbers.

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        if (num1==0 || num2==0 || num3==0){
            System.out.println("zero");
            return;
        }

        boolean isProductPositive= isPositive(num1, num2, num3);
        if (isProductPositive){
            System.out.println("positive");
        }
        else{
            System.out.println("negative");
        }
    }

    private static boolean isPositive(int num1, int num2, int num3) {
        int [] arrNumbers = new int[3];
        arrNumbers[0]=num1;
        arrNumbers[1]=num2;
        arrNumbers[2]=num3;
        int counterNegative=0;
        for (int i = 0; i < arrNumbers.length; i++) {
            int number= arrNumbers[i];
            if (number<0){
                counterNegative++;
            }
        }
        if (counterNegative==1||counterNegative==3){
            return false;
        }
        return true;
    }
}
