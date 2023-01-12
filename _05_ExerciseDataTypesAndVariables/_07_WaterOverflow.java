package _05_ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class _07_WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int numberLines= Integer.parseInt(scanner.nextLine());
        int capacityToFill= 255;
        int filledWater= 0;
        for (int currentLine = 1; currentLine <= numberLines ; currentLine++) {
            int quantityWaterToPour = Integer.parseInt(scanner.nextLine());
            if (capacityToFill<quantityWaterToPour){
                System.out.println("Insufficient capacity!");
                continue;
            }
            else {
                capacityToFill-=quantityWaterToPour;
                filledWater+=quantityWaterToPour;
            }
        }
        System.out.println(filledWater);
    }
}
