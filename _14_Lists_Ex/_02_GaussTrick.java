package _13_Lists_Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _02_GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write a program that sum all numbers in a list in the following order:
        //first + last, first + 1 + last - 1, first + 2 + last - 2, … first + n, last - n.

        List<Integer> numberList= new ArrayList<>();
        String []userInput = scanner.nextLine().split(" ");

        for (String stringNumber : userInput){
            numberList.add(Integer.parseInt(stringNumber));
        }
        int halfSize = numberList.size()/2;
        for (int i = 0; i < halfSize ; i++) {
            int sum = numberList.get(i)+ numberList.get(numberList.size()-1);
            numberList.set(i, sum);
            numberList.remove(numberList.size()-1);
        }
        /*for (int number:numberList){
            System.out.print(number+ " ");
        }*/
        System.out.println(numberList.toString().replaceAll("[\\[\\],]", ""));


    }
}
