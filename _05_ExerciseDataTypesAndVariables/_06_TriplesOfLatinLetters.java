package _05_ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class _06_TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Write a program to read an integer n and print all triples of
        // the first n small Latin letters, ordered alphabetically:

        int n = Integer.parseInt(scanner.nextLine());


        for (char letter1= 'a'; letter1<'a'+n; letter1++){
            for (char letter2= 'a'; letter2<'a'+n; letter2++){
                for (char letter3= 'a'; letter3<'a'+n; letter3++){
                    System.out.printf("%c%c%c%n", letter1, letter2, letter3);
                }
            }
        }
        // Also : 
        /*for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++){
                for (int k = 0; k < n; k++) {
                    char firstChar = (char) ('a'+i);
                    char secondChar = (char) ('a'+j);
                    char thirdChar = (char) ('a'+k);
                    System.out.printf("%c%c%c%n", firstChar, secondChar, thirdChar);

                }

            }

        }*/
    }
}
