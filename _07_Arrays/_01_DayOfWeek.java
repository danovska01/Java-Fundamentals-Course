package _07_Arrays;

import java.util.Scanner;

public class _01_DayOfWeek {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
//Enter a day number [1…7] and print the day name (in English) or "Invalid day!". Use an array of strings.

        String[] days = {
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
        };
        int day = Integer.parseInt(scanner.nextLine());

        if (day>=1 && day<=7){
            System.out.println(days[day-1]);
        }
        else {
            System.out.println("Invalid day!");
        }


    }
}
