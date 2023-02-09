package _18_02_ProgrammingFundamentalsMidExamRetake;

import java.util.Arrays;
import java.util.Scanner;

public class _02_ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        String[] items = inputLine.split(" ");

        int[] numbers = Arrays.stream(items)
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        //    • "swap {index1} {index2}"-  takes two elements and swap their places.
        //    • "multiply {index1} {index2}"- takes element at the 1st index and multiply it with the
        //    element at 2nd index. Save the product at the 1st index.
        //    • "decrease"- decreases all elements in the array with 1.

        String command = scanner.nextLine();
        while (!command.equals("end")){
            String [] tokens = command.split("\\s+");

            String currentCommand = tokens[0];
            switch (currentCommand){
                case "swap":
                    int index1= Integer.parseInt(tokens[1]);
                    int index2= Integer.parseInt(tokens[2]);
                    swapElements(index1, index2, numbers);
                    break;
                case "multiply":
                    index1 = Integer.parseInt(tokens[1]);
                    index2= Integer.parseInt(tokens[2]);
                    multiplyElements(index1, index2, numbers);

                    break;
                case "decrease":
                    decreaseBy1(numbers);
                    break;
                default:
                    break;
            }
                     command= scanner.nextLine();
        }
        //The output should be printed on the console and consist of elements of the modified array –
        // separated by a comma and a single space ", ".

        for (int i = 0; i < numbers.length-1; i++) {
            System.out.printf("%d, ", numbers[i]);
        }
        System.out.printf("%d", numbers[numbers.length-1]);
    }

    private static void decreaseBy1(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
             numbers[i]= numbers[i]-1;

        }
    }

    private static void multiplyElements(int index1, int index2, int[] numbers) {
        int product = numbers[index1]*numbers[index2];
        numbers[index1]=product;
    }

    private static void swapElements(int index1, int index2, int[] numbers) {
        int oldElement= numbers[index1];
        numbers[index1]=numbers[index2];
        numbers[index2]= oldElement;
    }
}
