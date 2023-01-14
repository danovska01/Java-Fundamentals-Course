package _11_Methods_Ex;

import java.util.Scanner;

public class _10_TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Read an integer n from the console. Find all top numbers in the range [1 … n] and print them.
        // A top number holds the following properties:
        //    • Its sum of digits is divisible by 8, e.g. 8, 16, 88.
        //    • Holds at least one odd digit, e.g. 232, 707, 87578.

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i < n; i++) {
            boolean isTopInteger= getIfTopInteger(i);
            if (isTopInteger){
                System.out.println(i);
            }
        }

    }

    private static boolean getIfTopInteger(int number) {
        int sumDigitsOfNumber=getSumDigits(number);
        int oddDigitsCount=oddDigitsCounter(number);
        if ((sumDigitsOfNumber%8==0)&&(oddDigitsCount>=1)){
            return true;
        }
        return false;
    }


    private static int getSumDigits(int number) {
        int sumDigits=0;
        while(number>0){
            int digit= number%10;
            sumDigits+=digit;
            number/=10;
        }
        return sumDigits;
    }
    private static int oddDigitsCounter(int number) {
        int oddDigitsCount=0;
        while(number>0){
            int digit= number%10;
            if (digit%2==1){
                oddDigitsCount++;
            }
            number/=10;
        }
        return oddDigitsCount;
    }

}
