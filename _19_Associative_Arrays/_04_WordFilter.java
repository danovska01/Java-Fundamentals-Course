package _19_Associative_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _04_WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Read an array of strings, take only words which length is even. Print each word on a new line.
        /*String [] input = scanner.nextLine().split(" ");
        Arrays.stream(input)
                .filter(word -> word.length()%2==0)
                .forEach(word-> System.out.println(word));*/
        String [] words = Arrays.stream(scanner.nextLine().split( " ")).filter(e -> e.length()%2==0).toArray(String[]::new);
        for (String currentWord: words) {
            System.out.println(currentWord);

        }

        
    }
}
