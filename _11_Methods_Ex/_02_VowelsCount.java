package _11_Methods_Ex;

import java.util.Locale;
import java.util.Scanner;

public class _02_VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write a method that receives a single string and prints the count of the vowels.

       String text = scanner.nextLine().toLowerCase(Locale.ROOT);
       countOfVowels(text);
    }
    private static void countOfVowels (String text){
        int countVowels =0;
        for (int i = 0; i < text.length(); i++) {
            char symbol= text.charAt(i);
            switch (symbol){
                case 'a':
                case 'o':
                case 'u':
                case 'e':
                case 'i':
                    countVowels++;
            }
        }
        System.out.println(countVowels);
    }
}
