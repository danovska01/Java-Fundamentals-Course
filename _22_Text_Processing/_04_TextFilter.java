package _22_Text_Processing;

import java.util.Scanner;

public class _04_TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a program that takes a text and a string of banned words. All words included in the ban list should be replaced with asterisks "*",
        // equal to the word's length. The entries in the ban list will be separated by a comma and space ", ".

        String [] wordsBanned = scanner.nextLine().split(", ");
        String text = scanner.nextLine();
        for (int i = 0; i <= wordsBanned.length-1 ; i++) {
            String currentWordBanned = wordsBanned[i];
            String replaceStars= "";
            for (int j = 0; j <=currentWordBanned.length()-1; j++) {
                replaceStars=replaceStars.concat("*");

            }
            text=text.replace(currentWordBanned, replaceStars);
        }
        System.out.println(text);


    }
}
