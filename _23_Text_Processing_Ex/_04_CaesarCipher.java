package _23_Text_Processing_Ex;

import java.util.Scanner;

public class _04_CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Write a program that returns an encrypted version of the same text. Encrypt the text by shifting each character
        // with three positions forward. For example A would be replaced by D, B would become E, and so on. Print the encrypted text.
        String text = scanner.nextLine();
        StringBuilder encryptedText= new StringBuilder();
        for (int i = 0; i <=text.length()-1 ; i++) {
            char currentSymbol= text.charAt(i);
            int index= currentSymbol;
            index+=3;
            char newSymbol= (char)index;
            encryptedText.append(newSymbol);
        }
        System.out.println(encryptedText);
    }
}
