package _09_Arrays_More_Ex;

import java.util.Arrays;
import java.util.Scanner;

public class _01_EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // inputTextOrder пази сумата на всяко следващо име
        int[] inputTextOrder = new int[n];

        int sum = 0;


       for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();

                char[] letter = input.toCharArray();
                for (char let : letter) {
                    if (let == 'a' || let == 'e' || let == 'i' || let == 'o' || let == 'u' || let == 'A' || let == 'E' || let == 'I' || let == 'O' || let == 'U') {
                        let *= letter.length;
                        sum += let;
                    } else {
                        let /= letter.length;
                        sum += let;
                    }
                }
                inputTextOrder[i] = sum;
                sum = 0;



            }
        Arrays.sort(inputTextOrder);
        for (int element : inputTextOrder) {
            System.out.println(element);


        }
    }
}



