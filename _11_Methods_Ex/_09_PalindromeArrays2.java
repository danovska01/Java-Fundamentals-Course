package _11_Methods_Ex;

import java.util.Arrays;
import java.util.Scanner;

public class _09_PalindromeArrays2 {
    private static Scanner scanner;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals("END")){

            boolean isPalindrome=palindrome(input);
            System.out.println(isPalindrome);

            input=scanner.nextLine();
        }
    }

    private static boolean palindrome(String input) {


        int [] numbers = new int [input.length()];
        for (int i=0; i<input.length(); i++){
            char numSymbol = input.charAt(i);
            int num=Integer.parseInt(String.valueOf(numSymbol));

            numbers[i]=num;
        }
        int halfSize= numbers.length/2;
        int index2= numbers.length-1;

        for (int i = 0; i < halfSize; i++) {
         int symbol1= numbers[i];
         int symbol2= numbers[index2];
            if (symbol1!=symbol2){
                return false;
            }

            index2--;
        }

        return true;
    }
}
