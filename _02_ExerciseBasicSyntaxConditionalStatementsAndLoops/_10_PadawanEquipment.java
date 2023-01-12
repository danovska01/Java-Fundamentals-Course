package _02_ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class _10_PadawanEquipment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double availableMoney = Double.parseDouble(scanner.nextLine());
        int numberStudents = Integer.parseInt(scanner.nextLine());
        double priceSabers = Double.parseDouble(scanner.nextLine());
        double priceRobes = Double.parseDouble(scanner.nextLine());
        double priceBelts = Double.parseDouble(scanner.nextLine());

        // lightsabers sometimes break, should buy 10% more, rounded up to the next integer.
        // Also, every sixth belt is free.

        // Needed equipment for X padawans:
        //sabresPrice * (studentsCount + 10%) + robesPrice * (studentsCount) + beltsPrice * (studentsCount - freeBelts)

        double lightsabersTotalPrice = (Math.ceil(numberStudents*1.1)) * priceSabers;
        double robesTotalPrice = priceRobes*numberStudents;
        int freeBelts = numberStudents/6;
        double beltsTotalPrice= priceBelts*(numberStudents-freeBelts);
        double equipment = lightsabersTotalPrice+robesTotalPrice+beltsTotalPrice;

        double neededMoney = equipment-availableMoney;

        if (availableMoney>=equipment){
            System.out.printf("The money is enough - it would cost %.2flv.%n", equipment);
        }
        else {
            System.out.printf("George Lucas will need %.2flv more.", neededMoney);
        }





    }
}
