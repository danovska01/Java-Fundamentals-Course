package _23_Text_Processing_Ex;

import java.util.Scanner;

public class _06_ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Write a program that reads a string from the console and replaces any sequence of the same letters with a single corresponding letter.

        StringBuilder text= new StringBuilder(scanner.nextLine());
        int textLength= text.length();

        for (int i = 0; i <textLength-1; i++) {
            if(text.charAt(i)==text.charAt(i+1)){
                text.deleteCharAt(i);
                i--;
                textLength= text.length();


            }

        }
        text= new StringBuilder(text.toString());
        System.out.println(text);

    }
}
