package _07_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _03_sumEvenNumbers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();
        String[] items = inputLine.split(" ");

        int[] numbers = Arrays.stream(items)
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        int evenSum = 0;

    for (int i=0; i<=numbers.length-1; i++){
       if (numbers[i]%2==0){
         evenSum+=numbers [i];
        }
    }


        System.out.println(evenSum);
    }
}
