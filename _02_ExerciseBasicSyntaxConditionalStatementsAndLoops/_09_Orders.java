package _02_ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class _09_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ((daysInMonth * capsulesCount) * pricePerCapsule)

        int countOrders = Integer.parseInt(scanner.nextLine());
        double totalPrice=0;

        for (int currentOrder=1; currentOrder<=countOrders; currentOrder++){
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());

            double price = days*capsulesCount*pricePerCapsule;
            totalPrice+=price;

            System.out.printf("The price for the coffee is: $%.2f%n", price);

        }
        System.out.printf("Total: $%.2f%n", totalPrice);
    }
}
