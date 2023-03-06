package _23_Text_Processing_Ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _01_ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] tokens = scanner.nextLine().split(", ");
       List<String> validUserNames = new ArrayList<>();

        //    A valid username is:
        //    • Has length between 3 and 16 characters
        //    • Contains only letters, numbers, hyphens and underscores

        for (int i = 0; i <= tokens.length-1; i++) {
            String currentUserName = tokens[i];
            boolean correctLength= checkLength(currentUserName);
            boolean containsCorrectSymbols=checkSymbols(currentUserName);
            if(correctLength&&containsCorrectSymbols){
                validUserNames.add(currentUserName);
            }

        }
        for(String userName:validUserNames){
            System.out.println(userName);
        }




    }

    private static boolean checkSymbols(String currentUserName) {
        for (int i = 0; i <=currentUserName.length()-1 ; i++) {
            char currentSymbol= currentUserName.charAt(i);
            if(Character.isLetter(currentSymbol)||Character.isDigit(currentSymbol)||currentSymbol=='-'||currentSymbol=='_'){
                continue;
            }
            else {
                return false;
            }
        }
        return true;
    }

    private static boolean checkLength(String currentUserName) {
        if(currentUserName.length()>=3 && currentUserName.length()<=16){
            return true;
        }
        return false;

    }
}
