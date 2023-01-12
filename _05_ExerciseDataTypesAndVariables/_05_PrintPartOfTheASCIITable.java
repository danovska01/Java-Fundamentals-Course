package _05_ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class _05_PrintPartOfTheASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // On the first line of input, you will receive the char index you should start with, and on the
        //second line - the index of the last character you should print.

        int startCharIndex = Integer.parseInt(scanner.nextLine());
        int endCharIndex = Integer.parseInt(scanner.nextLine());

        for (int currentSymbol = startCharIndex; currentSymbol <= endCharIndex; currentSymbol++) {
            char symbol = (char)currentSymbol;
            System.out.printf("%c ", symbol);

        }
    }
}
