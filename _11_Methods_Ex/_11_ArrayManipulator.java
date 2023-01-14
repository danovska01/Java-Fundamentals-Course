package _11_Methods_Ex;

import java.util.Arrays;
import java.util.Scanner;

public class _11_ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumbers[] = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] commandToString = command.split(" ");
            switch (commandToString[0]) {

                case "exchange":
                    int index = Integer.parseInt(commandToString[1]);
                    exchangeTheArray(inputNumbers, index);
                    break;

                case "max":
                    String num2 = commandToString[1];
                    if (num2.equals("odd")) {;
                        int maxIndex= maxFinder(inputNumbers, num2);
                        System.out.printf("[%d]", maxIndex);

                    } else if (num2.equals("even")) {
                        int maxIndex= maxFinder(inputNumbers, num2);
                        System.out.printf("[%d]", maxIndex);

                    }
                    break;
                case "min":
                    String num1 = commandToString[1];
                    if (num1.equals("odd")) {
                        int minIndex= minFinder(inputNumbers);
                        System.out.printf("[%d]", minIndex);

                    } else if (num1.equals("even")) {
                        int minIndex= minFinder(inputNumbers);
                        System.out.printf("[%d]", minIndex);

                    }
                    break;
                case "first":
                    break;
                case "last":
                    break;


            }

            command = scanner.nextLine();
        }
    }




    private static int maxFinder(int[] inputNumbers, String num2) {
        int maxOddNumber= Integer.MIN_VALUE;
        int maxEvenNumber= Integer.MIN_VALUE;
        int maxOddIndex=0;
        int maxEvenIndex=0;
        for (int i = 0; i < inputNumbers.length; i++) {
            if (inputNumbers[i]>maxOddNumber && inputNumbers[i]%2==1){
                maxOddNumber=inputNumbers[i];
                maxOddIndex=i;
            }
            if (inputNumbers[i]>maxEvenNumber && inputNumbers[i]%2==0){
                maxEvenIndex=inputNumbers[i];
                maxEvenIndex=i;
            }
        }
        if (num2.equals("even")){
            return maxEvenIndex;
        }

            return maxOddIndex;

    }

    private static int minFinder(int[] evensArr) {
        return 0;

    }


    private static void exchangeTheArray(int[] inputNumbers, int index) {
        if (index < 0 || index > inputNumbers.length) {
            System.out.println("Invalid index");
        } else {
            int rotations = index;
            int iterations = rotations % inputNumbers.length;
            for (int i = 0; i <= iterations; i++) {
                for (int j = 0; j < inputNumbers.length - 1; j++) {
                    String current = String.valueOf(inputNumbers[j]);
                    inputNumbers[j] = inputNumbers[j + 1];
                    inputNumbers[j + 1] = Integer.parseInt(current);
                }

            }
            for (int i : inputNumbers) {
                System.out.printf("[%d] ", i);
            }
        }


    }


}