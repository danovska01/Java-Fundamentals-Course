package _09_Arrays_More_Ex;

import java.util.Arrays;
import java.util.Scanner;

public class _01_EncryptSortAndPrintArray2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        // inputTextOrder пази сумата на всяко следващо име
        int[] inputTextOrder = new int[n];

        int sum = 0;

        for (int i = 0; i <n ; i++) {
            String name = scanner.nextLine();
            for (int j = 0; j <name.length() ; j++) {

                if (name.charAt(j) == 'a' || name.charAt(j) == 'e' || name.charAt(j) == 'i' || name.charAt(j) == 'o' || name.charAt(j) == 'u' ||
                        name.charAt(j) == 'A' || name.charAt(j) == 'E' || name.charAt(j) == 'I' || name.charAt(j) == 'O' || name.charAt(j) == 'U') {
                    sum += (name.charAt(j) * name.length());
                } else {
                    sum += (name.charAt(j) / name.length());
                }

            }
            inputTextOrder[i] = sum;
            sum = 0;


        }
        Arrays.sort(inputTextOrder);
        for (int total : inputTextOrder) {
            System.out.println(total);
        }
    }
}
