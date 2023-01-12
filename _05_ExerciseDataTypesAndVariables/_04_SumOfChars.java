package _05_ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class _04_SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Write a program, which sums the ASCII codes of n characters. Print the sum on the console.
        //     • On the first line, you will receive n – the number of lines, which will follow.
        //    • On the next n lines – you will receive letters from the Latin alphabet.

        int numberLines = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int currentLine =1; currentLine<=numberLines; currentLine++){
            String letter = scanner.nextLine();
            int letterNumFromTable= letter.charAt(0);

           // char letter = scanner.nextLine().charAt(0);
            //int letterNumFromTable = (int) letter;

            sum+=letterNumFromTable;

        }
        System.out.print("The sum equals: ");
        System.out.println(sum);


    }
}
