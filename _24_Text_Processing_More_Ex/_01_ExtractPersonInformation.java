package _24_Text_Processing_More_Ex;

import java.util.Scanner;

public class _01_ExtractPersonInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            StringBuilder input = new StringBuilder(scanner.nextLine());
            int indexOfNameStart = input.indexOf("@");
            int indexOfNameEnd = input.indexOf("|");
            String name = input.substring(indexOfNameStart+1, indexOfNameEnd );
            int indexOfAgeStart = input.indexOf("#");
            int indexOfAgeEnd = input.indexOf("*");
            String ageStr = input.substring(indexOfAgeStart + 1, indexOfAgeEnd);
            System.out.printf("%s is %s years old.%n", name, ageStr);


        }



        }
    }

