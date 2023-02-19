package _19_Associative_Arrays;

import javax.management.StringValueExp;
import java.util.*;

public class _02_WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Write a program which keeps a map with synonyms. The key of the map will be the word. The value will be a list of all the synonyms of that word.
        // You will be given a number n. On the next 2 * n lines you will be given a word and a synonym each on a separate line like this:
        //     • {word}
        //    • {synonym}
        // If you get the same word for second time, just add the new synonym to the list.
        //Print the words in the following format:
        //{word} - {synonym1, synonym2… synonymN}

        int count = Integer.parseInt(scanner.nextLine());
        Map<String, List<String>> synonymDictionary = new LinkedHashMap<>();


        for (int i = 1; i <= count; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            if (!synonymDictionary.containsKey(word)) {
                List<String> synonymsForCurrentWord = new ArrayList<>();
                synonymsForCurrentWord.add(synonym);
                synonymDictionary.put(word, synonymsForCurrentWord);
            } else {
                List<String> synonymsForCurrentWord = synonymDictionary.get(word);
                synonymsForCurrentWord.add(synonym);
                synonymDictionary.put(word, synonymsForCurrentWord);
            }

        }
        for (Map.Entry<String,List<String>> wordEntry:synonymDictionary.entrySet()) {
            String currentWord= wordEntry.getKey();
            List<String>synonymsForCurrentWord=wordEntry.getValue();
            System.out.printf("%s - %s%n", currentWord, String.join(", ", synonymsForCurrentWord));
            
        }
    }
}
