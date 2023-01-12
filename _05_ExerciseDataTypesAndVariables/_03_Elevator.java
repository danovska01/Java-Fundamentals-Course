package _05_ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class _03_Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());
        int courses = (int) Math.ceil(numberOfPeople*1.0/capacity);

        System.out.println(courses);

    }
}
