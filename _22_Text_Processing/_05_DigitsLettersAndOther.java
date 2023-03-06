package _22_Text_Processing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _05_DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        //Write a program that receives a single string and on the first line prints all the digits, on the second – all the letters, and on the third –
        // all the other characters. There will always be at least one digit, one letter and one other characters.
        String text = scanner.nextLine();
        List<String>digits= new ArrayList<>();
        List<String>letters= new ArrayList<>();
        List<String>otherCharacters= new ArrayList<>();
        for (int i = 0; i <=text.length()-1 ; i++) {
            char currentSymbol= text.charAt(i);
            boolean isDigit = Character.isDigit(currentSymbol);
            boolean isLetter = Character.isLetter(currentSymbol);
            boolean isLetterOrDigit = Character.isLetterOrDigit(currentSymbol);
            if(isDigit){
                digits.add(String.valueOf(currentSymbol));
            }
            if (isLetter){
                letters.add(String.valueOf(currentSymbol));
            }
            if (!isLetterOrDigit){
                otherCharacters.add(String.valueOf(currentSymbol));
            }

        }
        for (String digit:digits
             ) {
            System.out.print(digit);
        }
        System.out.println();
        for (String letter:letters
        ) {
            System.out.print(letter);
        }
        System.out.println();
        for (String otherSymbol:otherCharacters
        ) {
            System.out.print(otherSymbol);
        }

    }
}
