package _23_Text_Processing_Ex;

import java.util.Scanner;

public class _02_CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Create a method that takes two strings as arguments and returns the sum of their character codes multiplied
        // (multiply str1[0] with str2[0] and add to the total sum).

        String[] tokens = scanner.nextLine().split(" ");

        String token1 = tokens[0];
        String token2 = tokens[1];
        int sum = 0;
        int remainingSum=0;
        int shorterLength =0;

        if(token1.length()==token2.length()){
            sum= sumUntilEqualLength(token1, token2);
        }
        if (token1.length() < token2.length()) {
            shorterLength = token1.length();
           sum=sumUntilEqualLength(token1,token2);
            remainingSum= remainingSum(token2, shorterLength);
        }
        else {
            shorterLength = token2.length();
            sum=sumUntilEqualLength(token2, token1);
            remainingSum=remainingSum(token1, shorterLength);

        }
        sum+=remainingSum;
        System.out.println(sum);


     }

    private static int remainingSum(String input, int shortestLength) {
        int remainingSum=0;
        for (int i = shortestLength; i <= input.length()-1; i++) {
            int currentSymbolNumber=input.charAt(i);
            remainingSum+=currentSymbolNumber;

        }

        return remainingSum;

    }

    private static int sumUntilEqualLength(String input1, String input2) {
        int sum=0;
        for (int i = 0; i <= input1.length() - 1; i++) {
            int currentSymbolInNumber1 = input1.charAt(i);
            int currentSymbolInNumber2 = input2.charAt(i);
            int multiply = currentSymbolInNumber1 * currentSymbolInNumber2;
            sum += multiply;
        }
        return sum;
    }


}
