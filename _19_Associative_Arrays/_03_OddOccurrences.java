package _19_Associative_Arrays;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _03_OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write a program that extracts from a given sequence of words all elements that are present in it an odd number of times (case-insensitive).
        // Words are given in a single line, space separated
        // Print the result elements in lowercase in their order of appearance

        String input = scanner.nextLine();
        String [] words = input.split(" ");

        //Use a LinkedHashMap (String  int) to count the occurrences of each word:
        Map<String, Integer> counts = new LinkedHashMap<>();
        //Pass through all elements in the array and count each word:
        for (String word: words) {
            String wordInLowerCase = word.toLowerCase();
            if(counts.containsKey(wordInLowerCase)){
                counts.put(wordInLowerCase, counts.get(wordInLowerCase)+ 1);
            }
            else {
                counts.put(wordInLowerCase, 1);
            }
        }
        //Create a new ArrayList (String), which will hold all the words with odd occurrences:
        ArrayList<String>odds = new ArrayList<>();
        for(var entry: counts.entrySet()){
            if (entry.getValue()%2==1){
                odds.add(entry.getKey());

            }
        }
        //Now all that is left is to print the words, separated by comma and single space (", ").
        for (int i = 0; i < odds.size(); i++) {
            System.out.print(odds.get(i));
            if(i<odds.size()-1){
                System.out.print(", ");
            }
            
        }

    }
}
