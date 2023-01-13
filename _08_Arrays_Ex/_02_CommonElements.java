package _08_Arrays_Ex;

import java.util.Arrays;
import java.util.Scanner;

public class _02_CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write a program, which prints common elements in two arrays. You have to compare
        // the elements of the second array to the elements of the first.

        String firstInput = scanner.nextLine();
        String[] firstArr = firstInput.split(" ");

        String secondInput = scanner.nextLine();
        String[] secondArr = secondInput.split(" ");


        /*String first [] =  (sc.nextLine()).split(" ");
        String second [] = (sc.nextLine()).split(" ");

        for (int i = 0; i < firstArr.length; i++) {
        for (int j = 0; j < secondArr.length; j++) {
        if(firstArr[i].equals(secondArr[j])){
         System.out.print(secondArr[j] + " ");
        }*/
        for (String secondWord: secondArr){
            for(String firstWord: firstArr){
                if (secondWord.equals(firstWord)){
                    System.out.println(firstWord+ " ");
                }


            }
        }

            }
        }








