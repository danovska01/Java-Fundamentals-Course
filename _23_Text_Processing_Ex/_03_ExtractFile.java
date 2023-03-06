package _23_Text_Processing_Ex;

import java.util.Scanner;

public class _03_ExtractFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Write a program that reads the path to a file and subtracts the file name and its extension.
        String [] tokens = scanner.nextLine().split("\\\\");
        String token = tokens[tokens.length-1];
        StringBuilder fileName= new StringBuilder();
        StringBuilder fileExtension= new StringBuilder();
        int pointPosition=0;
        for (int i = 0; i <= token.length()-1 ; i++) {
            char currentChar= token.charAt(i);
            if(currentChar=='.'){
                pointPosition=i;
                System.out.println("File name: "+ fileName);
                break;
            }
            fileName.append(currentChar);
        }
        for (int i = pointPosition+1; i <= token.length()-1 ; i++) {
            char currentChar= token.charAt(i);
            fileExtension.append(currentChar);
        }
        System.out.println("File extension: "+ fileExtension);


    }
}
