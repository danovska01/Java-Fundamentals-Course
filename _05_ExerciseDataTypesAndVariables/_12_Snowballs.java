package _05_ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class _12_Snowballs {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int numberSnowballs = Integer.parseInt(scanner.nextLine());
        double highestCalculatedSnowballValue=0;
        int highestSnow =0;
        int highestTime =0;
        int highestQuality=0;

        for (int currentSnowball = 1; currentSnowball <=numberSnowballs ; currentSnowball++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            double snowballValue= Math.pow((snowballSnow*1.0/snowballTime),(snowballQuality*1.0));
            if (snowballValue>=highestCalculatedSnowballValue){
                highestCalculatedSnowballValue=snowballValue;
                highestSnow=snowballSnow;
                highestTime=snowballTime;
                highestQuality=snowballQuality;
            }

        }
        System.out.printf("%d : %d = %.0f (%d)", highestSnow, highestTime,highestCalculatedSnowballValue, highestQuality );
    }
}
