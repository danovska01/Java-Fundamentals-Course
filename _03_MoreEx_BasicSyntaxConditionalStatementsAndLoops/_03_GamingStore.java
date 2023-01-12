package _03_MoreEx_BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class _03_GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double currentBalance= Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        double price = 0;
        double leftBalance= currentBalance;
        boolean noBalance= false;

        while (!input.equals("Game Time")){
            String game = input;
            switch (game){
                case "OutFall 4":
                    price=39.99;
                    break;
                case "CS: OG":
                    price=15.99;
                    break;
                case "Zplinter Zell":
                    price=19.99;
                    break;
                case "Honored 2":
                    price=59.99;
                    break;
                case "RoverWatch":
                    price=29.99;
                    break;
                case "RoverWatch Origins Edition":
                    price=39.99;
                    break;
                default:
                    System.out.println("Not Found");
                    input = scanner.nextLine();
                    continue;
            }

            if (leftBalance<price){
                System.out.println("Too Expensive");
            }
            else if (leftBalance>=price){
                leftBalance-=price;
                System.out.printf("Bought %s%n", game);
                if (leftBalance<=0){
                    noBalance=true;
                    break;
                }

            }

            input= scanner.nextLine();
        }
        if (noBalance){
            System.out.println("Out of money!");
        }
        else {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f%n", currentBalance-leftBalance, leftBalance);
        }
    }
}
