package _26_RegularExpressions_Ex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex ="(?<name>[A-Z][a-z]*),? ?";
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile(regex);
        Matcher name = pattern.matcher(input);
        while(name.find()){
            System.out.println(name);

        }
    }
}
