package _01_BasicSyntaxConditionalStatementsAndLoop;

import java.util.Scanner;

public class _07_TheatrePromotions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeDay = scanner.nextLine().toLowerCase();
        int age = Integer.parseInt(scanner.nextLine());
        double price = 0;

        if (age<0 || age>122){
            System.out.println("Error!");
        }
        else {

        if (typeDay.equals("weekday")) {
            if ((0 <= age) && (age <= 18) || (64 < age && age <= 122)) {
                price = 12;
            } if (18 < age && age <= 64){
                price = 18;
            }
        } if (typeDay.equals("weekend")) {
            if ((0 <= age) && (age <= 18) || (64 < age && age <= 122)) {
                price = 15;
            }  if (18 < age && age <= 64){
                price = 20;
            }

        } else if (typeDay.equals("holiday")) {
            if ((0 <= age) && (age <= 18)) {
                price = 5;
            } else if ((18 < age) && (age <= 64)){
                price = 12;
            }else if ((64 < age) && (age <= 122)){
                price = 10;
            }

        }

            System.out.printf("%.0f$",price );
        }

    }


}

