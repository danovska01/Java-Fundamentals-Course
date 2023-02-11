package _18_04_ProgrammingFundamentalsMidExamRetake;

import java.util.Scanner;

public class _01_GuineaPig {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double foodKg= Double.parseDouble(scanner.nextLine());
        double hayKg= Double.parseDouble(scanner.nextLine());
        double coverKg= Double.parseDouble(scanner.nextLine());
        double guineaWeightKg= Double.parseDouble(scanner.nextLine());

        // Every day Puppy eats 300 gr of food.
        // Every second day Merry first feeds the pet, then gives it a certain amount of hay
        // equal to 5% of the rest of the food.
        // On every third day, Merry puts Puppy cover with a quantity of 1/3 of its weight.
        //Calculate whether the quantity of food, hay, and cover, will be enough for a month.

        double foodAvailable= foodKg;
        double hayAvailable= hayKg;
        double coverAvailable= coverKg;

        for (int day = 1; day <=30 ; day++) {
            if(foodAvailable<0.3 || hayAvailable<foodAvailable*0.05 || coverAvailable<guineaWeightKg/3){
                break;
            }
            foodAvailable-=0.3;
            if(day%2==0){
                hayAvailable-=(foodAvailable*0.05);
            }
            if(day%3==0){
                coverAvailable-=(guineaWeightKg/3);
            }


        }
        if(foodAvailable<0.3 || hayAvailable<foodAvailable*0.05 || coverAvailable<guineaWeightKg/3){
            System.out.println("Merry must go to the pet store!");
        }

        else {
        System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.", foodAvailable, hayAvailable, coverAvailable);
    }

    }
}
