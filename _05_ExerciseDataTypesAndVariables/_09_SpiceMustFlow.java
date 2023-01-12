package _05_ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class _09_SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double startingYield = Double.parseDouble(scanner.nextLine());

        int daysCounter=0;
        int produced =0;

        if (startingYield>=100){
        while (startingYield>=100){
            produced+=(startingYield-26);
            startingYield-=10;
            daysCounter++;

        }
            produced-=26;
            System.out.println(daysCounter);
            System.out.printf("%d", produced);

        }
        else {
            System.out.println(daysCounter);
            System.out.printf("%d", produced);
        }


    }
    }

