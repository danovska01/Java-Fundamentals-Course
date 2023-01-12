package _05_ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class _08_BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        //Calculate the volume using the following formula: π * r^2 * h.
        double maxVolume=0;
        String biggestModel= "";

        for (int i = 1; i<=n; i++){
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            double volume = Math.PI * Math.pow(radius, 2)*height;

            if (volume>=maxVolume){
                maxVolume=volume;
                biggestModel=model;
            }

        }
        System.out.printf("%s", biggestModel);

    }
}
