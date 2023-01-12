package _04_DataTypesAndVariables;

import java.math.BigDecimal;
import java.util.Scanner;

public class _03_ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal sum = new BigDecimal(0);


        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            BigDecimal num1 = new BigDecimal(scanner.nextLine());
            sum = sum.add(num1);

        }
        System.out.println(sum);

    }
}
