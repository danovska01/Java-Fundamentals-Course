package _02_ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class _03_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberPeople = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String weekday = scanner.nextLine();
        double price = 0;

        switch (weekday){
            case "Friday":
                switch (groupType){
                    case "Students":
                        price=8.45;
                        break;
                    case "Business":
                        price=10.9;
                        break;
                    case "Regular":
                        price=15;
                        break;
                }
                break;
            case "Saturday":
                switch (groupType){
                    case "Students":
                        price=9.8;
                        break;
                    case "Business":
                        price=15.6;
                        break;
                    case "Regular":
                        price=20;
                        break;
                }
                break;
            case "Sunday":
                switch (groupType){
                    case "Students":
                        price=10.46;
                        break;
                    case "Business":
                        price=16;
                        break;
                    case "Regular":
                        price=22.5;
                        break;
                }
                break;
        }
        double totalPrice = price*numberPeople;

        if (groupType.equals("Students")&&numberPeople>=30){
            totalPrice*=0.85;
        }
        else if (groupType.equals("Business")&&numberPeople>=100){
            totalPrice= totalPrice-(10*price);
        }
        else if (groupType.equals("Regular")&&(numberPeople>=10&&numberPeople<=20)){
            totalPrice*=0.95;
        }


        System.out.printf("Total price: %.2f", totalPrice);

    }
}
