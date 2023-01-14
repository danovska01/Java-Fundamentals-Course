package _11_Methods_Ex;

import java.util.Scanner;

public class _09_PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // A palindrome is a number which reads the same backward as forward, such as 323 or 1001.
        // Write a program which reads a positive integer numbers until you receive "END". 
        // For each number print whether the number is palindrome or not.
        
        String input = scanner.nextLine(); 
        while (!input.equals("END")){

            boolean isPalindrome=palindrome(input);
            System.out.println(isPalindrome);
            
            input=scanner.nextLine(); 
        }
    }

    private static boolean palindrome(String input) {
        int halfSize= input.length()/2;
        int index1=0;
        int index2=input.length()-1;

        for (int i = 0; i < halfSize; i++) {
                char symbol1= input.charAt(index1);
                char symbol2= input.charAt(index2);
                if (symbol1!=symbol2){
                    return false;
                }
            index1++;
            index2--;
        }

        return true;
    }
}
