package _18_01_ProgrammingFundamentalsMidExamRetake;

import java.util.Scanner;

public class _01_ComputerStore {
    //Write a program that prints you a receipt for your new computer. You will receive the parts' prices
    // (without tax) until you receive what type of customer this is -special or regular.
    //Once you receive the type of customer you should print the receipt.
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String input= scanner.nextLine();
        double sum=0;
        while(true){
            if(input.equals("special")){
                break;
            }
            if(input.equals("regular")){
                break;
            }
            double currentPrice= Double.parseDouble(input);
            if (currentPrice<0){
                System.out.println("Invalid price!");
                input=scanner.nextLine();
                continue;
            }
            sum+=currentPrice;

            input= scanner.nextLine();
        }

        double taxes=0.2*sum;
        double sumWithTaxes= sum+taxes;
        if (input.equals("special")){
            // If the customer is special, he has a 10% discount on the total price with taxes.
            sumWithTaxes*=0.9;

        }
        if(sum==0){
            System.out.println("Invalid order!");
        }

        else{
            System.out.printf("Congratulations you've just bought a new computer!%nPrice without taxes: %.2f$%n", sum);
            System.out.printf("Taxes: %.2f$%n-----------%nTotal price: %.2f$",taxes, sumWithTaxes );
        }
    }


}
