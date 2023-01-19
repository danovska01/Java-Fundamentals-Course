package _15_ObjectsAndClasses;

import java.math.BigInteger;
import java.util.Scanner;

public class _02_SumBigNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // You will receive two numbers (0 to 1050), print their sum.

        BigInteger firstNumber = new BigInteger(scanner.nextLine());
        BigInteger secondNumber = new BigInteger(scanner.nextLine());
        BigInteger sum = firstNumber.add(secondNumber);
        System.out.println(sum);
    }
}
