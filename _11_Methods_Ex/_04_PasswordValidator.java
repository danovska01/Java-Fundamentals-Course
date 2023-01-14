package _11_Methods_Ex;

import java.util.Objects;
import java.util.Scanner;

public class _04_PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write a program that checks if a given password is valid. Password rules are:
        //    • 6 – 10 characters (inclusive);
        //    • Consists only of letters and digits;
        //    • Have at least 2 digits.

        String password = scanner.nextLine();
        boolean passwordLength = passwordLength(password);
        boolean passwordContent = passwordContent(password);
        boolean passwordDigitsCount = passwordDigitsCount(password);
        if (!passwordLength){
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!passwordContent){
            System.out.println("Password must consist only of letters and digits");
        }
        if(!passwordDigitsCount){
            System.out.println("Password must have at least 2 digits");
        }
        if (passwordLength && passwordContent && passwordDigitsCount){
            System.out.println("Password is valid");
        }




    }
    private static boolean passwordLength(String text) {
        int countChars = 0;
        for (int i = 0; i < text.length(); i++) {
            countChars++;
        }
        if (countChars <= 6 || countChars >= 10) {
            return false;
        }
        return true;
    }
    private static boolean passwordContent (String password){
        for (int i = 0; i < password.length(); i++) {
           char current = password.charAt(i);
           if (!(Character.isLetter(current)|| Character.isDigit(current))){
               return false;
           }
        }
        return true;
    }
    private static boolean passwordDigitsCount (String text){
        int digitCounts= 0;
        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            if (Character.isDigit(current)){
                digitCounts++;
            }
        }
        if (digitCounts<2){
            return false;
        }
        return true;

    }
}
