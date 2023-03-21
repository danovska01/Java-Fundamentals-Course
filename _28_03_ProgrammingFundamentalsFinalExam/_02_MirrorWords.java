package _28_03_ProgrammingFundamentalsFinalExam;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _02_MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String regex = "([@#])(?<word1>[A-Za-z]{3,})(\\1{2})(?<word2>[A-Za-z]{3,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        List<String> listMirrorWords= new LinkedList<>();

        int count = 0;

        while (matcher.find()){
            count++;

            String word1= matcher.group("word1");
            String word2= matcher.group("word2");
            StringBuilder sb = new StringBuilder(word2);
            String word2Reversed= String.valueOf(sb.reverse());
            if(word1.equals(word2Reversed)){
                listMirrorWords.add(word1 + " <=> " + word2);
                //listMirrorWords.add(String.format("%s  <=>  %s%n", word1, word2));
                //ListMirrorWords.forEach(System.out::print);

            }

        }

        if(count==0){
            System.out.println("No word pairs found!");
        }
        else {
            System.out.println(count + " word pairs found!");
        }
        if(listMirrorWords.isEmpty()){
            System.out.println("No mirror words!");
        }
        else {
        String matches = String.join(", ", listMirrorWords);
        System.out.printf("The mirror words are:%n%s%n", matches);
        }

    }
}
