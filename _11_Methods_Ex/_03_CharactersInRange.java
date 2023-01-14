package _11_Methods_Ex;

import java.util.Scanner;

public class _03_CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write a method that receives two characters and prints on a single line all the
        // characters in between them according to ASCII.


        char x1 = scanner.nextLine().charAt(0);
        char x2 = scanner.nextLine().charAt(0);
        printCharactersBetween(x1, x2);

    }
    private static void printCharactersBetween(char x1, char x2) {

        if (x1 < x2) {
            for (int i = x1 + 1; i < x2; i++) {
                char current = (char) i;
                System.out.print(current + " ");

            }
        } else {
            for (int i = x2 + 1; i < x1; i++) {
                char current = (char) i;
                System.out.print(current + " ");

            }

        }
    }
}
