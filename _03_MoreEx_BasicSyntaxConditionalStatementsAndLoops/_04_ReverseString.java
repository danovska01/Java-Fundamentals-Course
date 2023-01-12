package _03_MoreEx_BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class _04_ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a program that reverses a string and prints it on the console.


        String input = scanner.nextLine();
        String reversedText= "";

        for (int position= input.length()-1; position>=0; position--){
            char symbol = input.charAt(position);
            reversedText+=symbol;
        }
        System.out.printf("%s", reversedText);
    }
}
