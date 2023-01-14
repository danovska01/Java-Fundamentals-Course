package _10_Methods;

import java.util.Scanner;

public class _05_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //  The method should receive one of the following products: coffee, water, coke, snacks;
        //  and a quantity of the product.

        String product = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        order (product, quantity);

    }

    private static void order(String product, double quantity) {
        double finalPrice=0;
        switch (product){
            case "coffee":
              finalPrice= quantity*1.5;
                break;
            case "water":
                finalPrice= quantity*1;
                break;
            case "coke":
                finalPrice= quantity*1.4;
                break;
            case "snacks":
                finalPrice= quantity*2;
                break;

        }
        System.out.printf("%.2f", finalPrice);
    }

}
