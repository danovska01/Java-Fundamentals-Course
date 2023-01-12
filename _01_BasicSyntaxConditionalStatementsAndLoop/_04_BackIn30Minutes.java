package _01_BasicSyntaxConditionalStatementsAndLoop;

import java.util.Scanner;

public class _04_BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());

        int minutesAfter30 = min+30;

        if (minutesAfter30>59){
            hour=hour+1;
            minutesAfter30-=60;
            if (hour>23){
                hour=hour-24;

            }

        }
        System.out.printf("%01d:%02d", hour, minutesAfter30);

    }
}
