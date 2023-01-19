package _15_ObjectsAndClasses;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _01_RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in);
        // You are given a list of words on one line. Randomize their order and print each word on a separate line.
        String[] words = scanner.nextLine().split(" ");
        Random rnd = new Random();
        for (int pos1 = 0; pos1 < words.length; pos1++) {
            int pos2 = rnd.nextInt(words.length);
            String oldWord= words[pos1];
            words[pos1]=words[pos2];
            words[pos2]=oldWord;

        }
        System.out.println(String.join(
                System.lineSeparator(), words));


    }
}

