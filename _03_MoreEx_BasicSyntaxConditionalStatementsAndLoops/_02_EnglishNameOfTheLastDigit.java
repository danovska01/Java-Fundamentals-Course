package _03_MoreEx_BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class _02_EnglishNameOfTheLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int lastDigit = number%10;
        String theDigitIs = "";

        switch (lastDigit){
            case 0:
                theDigitIs="zero";
                break;
            case 1:
                theDigitIs="one";
                break;
            case 2:
                theDigitIs="two";
                break;
            case 3:
                theDigitIs="three";
                break;
            case 4:
                theDigitIs="four";
                break;
            case 5:
                theDigitIs="five";
                break;
            case 6:
                theDigitIs="six";
                break;
            case 7:
                theDigitIs="seven";
                break;
            case 8:
                theDigitIs="eight";
                break;
            case 9:
                theDigitIs="nine";
                break;
        }
        System.out.printf("%s", theDigitIs);
    }
}
