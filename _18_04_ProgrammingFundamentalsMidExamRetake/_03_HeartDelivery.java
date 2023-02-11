package _18_04_ProgrammingFundamentalsMidExamRetake;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _03_HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Integer> numbers = Arrays.stream(input.split("@")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();
        int index = 0;
        int position = 0;

        while (!command.equals("Love!")) {
            String[] tokens = command.split("\\s+");
            int numberToJump = Integer.parseInt(tokens[1]);

            index += numberToJump;

            if (index < numbers.size()) {
                if (numbers.get(index) < 2) {
                    System.out.printf("Place %d already had Valentine's day.%n", index);
                    position = index;
                    command = scanner.nextLine();
                    continue;
                }
                if (numbers.get(index) >= 2) {
                    int newNumber = numbers.get(index) - 2;
                    position = index;
                    numbers.set(index, newNumber);
                    if (newNumber == 0) {
                        System.out.printf("Place %d has Valentine's day.%n", index);
                        position = index;
                        numbers.set(index, newNumber);
                        command = scanner.nextLine();

                        continue;
                    }

                }


            } else {
                index = 0;

                if (numbers.get(index) < 2) {//counter>=2 &&
                    System.out.printf("Place %d already had Valentine's day.%n", index);
                    position = index;
                    command = scanner.nextLine();
                    continue;
                }

                if (numbers.get(index) >= 2) {
                    int newNumber = numbers.get(index) - 2;
                    position = index;
                    numbers.set(index, newNumber);
                    if (newNumber == 0) {
                        System.out.printf("Place %d has Valentine's day.%n", index);
                        position = index;
                        numbers.set(index, newNumber);
                        command = scanner.nextLine();

                        continue;
                    }

                }

            }

            command = scanner.nextLine();
        }
        int failedTimes = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) != 0) {
                failedTimes++;
            }

        }
        System.out.printf("Cupid's last position was %d.%n", position);
        if (failedTimes == 0) {
            System.out.println("Mission successful.");


        } else {
            System.out.printf("Cupid has failed %d places.%n", failedTimes);

        }
    }

}
