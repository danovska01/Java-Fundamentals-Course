package _28_04_ProgrammingFundamentalsFinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _02_FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        String regex = "@#+(?<barcode>[A-Z][A-Za-z\\d]{4,}[A-Z])@#+";

        Pattern pattern = Pattern.compile(regex);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
           String input = scanner.nextLine();
           Matcher matcher = pattern.matcher(input);
           if(matcher.find()){
               String groupNumber= findGroupNumber(input);
               System.out.println("Product group: "+ groupNumber);
           }
           else {
               System.out.println("Invalid barcode");
           }
       }

    }

    private static String findGroupNumber(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if(Character.isDigit(input.charAt(i)))
            sb.append(input.charAt(i));
        }
        if(sb.length()==0){
           sb.append("00");

        }
        String groupNumber=sb.toString();



        return groupNumber;

    }
    }
