package _15_ObjectsAndClasses;

import java.math.BigInteger;
import java.util.Scanner;

import static java.lang.String.valueOf;

public class _03_BigFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // You will receive N - number in range [0 - 1000]. Calculate Factorial of N and print the result.
        int n = Integer.parseInt(scanner.nextLine());
        BigInteger factorial = new BigInteger(valueOf(1));


        for (int i = 1; i <=n; i++) {
            factorial= factorial.multiply(BigInteger.valueOf(Integer.parseInt(String.valueOf(i))));


        }
        System.out.println(factorial);
    }
}
