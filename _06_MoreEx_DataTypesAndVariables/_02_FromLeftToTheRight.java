package _06_MoreEx_DataTypesAndVariables;


import java.util.Scanner;

public class _02_FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= counter; i++) {
            String input = scanner.nextLine();
            String[] parts = input.split(" ");
            String part1 = parts[0];
            String part2 = parts[1];
            long number1 = Long.parseLong(part1);
            long number2 = Long.parseLong(part2);
            long biggest = Math.max(number1, number2);
            int sum = 0;

            while (biggest != 0) {
                sum += biggest % 10;
                biggest /= 10;
            }
            System.out.println(Math.abs(sum));
        }


    }


}





