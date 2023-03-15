package _26_RegularExpressions_Ex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _06_ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //<user> is a sequence of letters and digits, where '.', '-' and '_' can appear between them.
        //<host> is a sequence of at least two words, separated by dots '.'. Each word is sequence of letters and can have hyphens '-' between the letters.
        String input = scanner.nextLine();
        String regex= "(^|(?<=\\s))(([a-zA-Z0-9]+)([\\.\\-_]?)([A-Za-z0-9]+)(@)([a-zA-Z]+([\\.\\-][A-Za-z]+)+))(\\b|(?=\\s))";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()){
            System.out.println(matcher.group());
        }

    }
}
