package _25_RegularExpressions;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _02_MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Write a regular expression to match a valid phone number from Sofia.
        // After you find all valid phones, print them on the console, separated by a comma and a space “, ”.
        String regex = "\\+359(?<first>[ -])2\\1[\\d]{3}\\1[\\d]{4}\\b";
        String phonesInput = scanner.nextLine();
        Pattern pattern = Pattern.compile(regex);
        Matcher phoneMatcher = pattern.matcher(phonesInput);
        List<String> matchedPhones = new LinkedList<>();
        while (phoneMatcher.find()){
            matchedPhones.add(phoneMatcher.group());
        }
        //System.out.println(String.join(", ", matchedPhones));
        System.out.println(matchedPhones.toString().replaceAll("[\\[\\]]", ""));
    }
}
