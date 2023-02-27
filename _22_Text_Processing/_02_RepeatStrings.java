package _22_Text_Processing;

import java.util.Scanner;

public class _02_RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Write a Program That Reads an Array of Strings. Each String is Repeated N Times, Where N is the Length of the String. Print the Concatenated String.
        String [] input= scanner.nextLine().split(" ");
        String concatenatedString = "";
        for (int i = 0; i <= input.length-1; i++) {
            String currentWord= input[i];
            String currentConcatenated = "";
            for (int j = 0; j <= currentWord.length()-1; j++) {
                currentConcatenated+=currentWord;
            }
            concatenatedString+=currentConcatenated;
        }
        System.out.println(concatenatedString);
    }
}
