package _02_ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class _07_VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double money = 0;

        while (!input.equals("Start")) {
            double coin = Double.valueOf(input);
            if ((coin == 0.1) || (coin == 0.2) || (coin == 0.5) || (coin == 1) || (coin == 2)) {
                money += coin;
            } else {
                System.out.printf("Cannot accept %.2f%n", coin);
            }
            input = scanner.nextLine();
        }
        if (input.equals("Start")) {
            String input2 = scanner.nextLine();


            double priceProduct = 0;
            double moneyLeft = money;

            while (!input2.equals("End")) {
                String product = input2;
                boolean inValid = false;

                switch (product) {
                    case "Nuts":
                        priceProduct = 2.0;
                        break;
                    case "Water":
                        priceProduct = 0.7;
                        break;
                    case "Crisps":
                        priceProduct = 1.5;
                        break;
                    case "Soda":
                        priceProduct = 0.8;
                        break;
                    case "Coke":
                        priceProduct = 1;
                        break;
                    default:
                        System.out.println("Invalid product");
                        inValid = true;
                        break;
                }


                if ((moneyLeft >= priceProduct) && !inValid) {
                    System.out.printf("Purchased %s%n", product);
                    moneyLeft -= priceProduct;
                } else {
                    if (!inValid) {
                        System.out.printf("Sorry, not enough money%n");
                    }
                }
                inValid = false;
                input2 = scanner.nextLine();
            }
            System.out.printf("Change: %.2f", moneyLeft);


        }
    }
}
