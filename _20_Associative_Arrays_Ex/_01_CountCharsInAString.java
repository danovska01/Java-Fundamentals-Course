package _20_Associative_Arrays_Ex;

import java.text.DecimalFormat;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _01_CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Write a program, which counts all characters in a string except space (' ').
        //Print all occurrences in the following format:
        //{char} -> {occurrences}

        String input = scanner.nextLine();

        Map<Character,Integer>counterProgram= new LinkedHashMap();

        for (int i = 0; i <= input.length()-1; i++) {
            char currentChar = input.charAt(i);
            if (currentChar==32){
                continue;
            }
            if(!counterProgram.containsKey(currentChar)){
                 counterProgram.put(currentChar, 1);
            }
            else {
                counterProgram.put(currentChar, counterProgram.get(currentChar)+ 1);
            }

        }
        for (Map.Entry<Character, Integer> entry : counterProgram.entrySet()) {
            System.out.printf("%c -> %d%n", entry.getKey(), entry.getValue());
        }


    }
}
