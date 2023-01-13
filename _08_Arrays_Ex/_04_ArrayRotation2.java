package _08_Arrays_Ex;

import java.util.Scanner;

public class _04_ArrayRotation2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String input = scanner.nextLine();
        String [] numbers = input.split(" ");
        int countRotations = Integer.parseInt(scanner.nextLine());

        for (int rotation = 1; rotation <= countRotations; rotation++) {

            // 1.Взимам си първия елемент.
            String firstElement = numbers[0];

            //2. Местя всички елементи с 1 наляво. Индексът на елементите= индекс-1
            for (int index = 0; index < numbers.length-1; index++) {
                numbers[index]= numbers[index+1];
            }
            //3. На последния индекс -> първият елемент
            numbers[numbers.length-1]= firstElement;

        }
        // System.out.printLn(String.join(" ", numbers))
        for(String i: numbers){
            System.out.print(i + " ");
        }


    }
}
