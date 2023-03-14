package _26_RegularExpressions_Ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _01_Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //">>{furniture name}<<{price}!{quantity}"

        String regex = ">>(?<purchase>[A-Za-z\\s]+)<<(?<price>\\d+(.\\d+)?)!(?<quantity>\\d+)";

        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile(regex);


        double sum = 0;
        List<String> listOfPurchases = new ArrayList<>();
        while (!input.equals("Purchase")){
            Matcher staff = pattern.matcher(input);
            if(staff.find()){
            String nameFurniture = staff.group("purchase");
            double price = Double.parseDouble(staff.group("price"));
            int quantity = Integer.parseInt(staff.group("quantity"));
            double currentMoney = price*quantity;
            sum+=currentMoney;
            listOfPurchases.add(nameFurniture);



        }
            input= scanner.nextLine();
        }
        System.out.printf("%nBought furniture:%n");
        for (String currentPurchase:listOfPurchases
             ) {
            System.out.printf("%s%n", currentPurchase);

        }
        System.out.printf("Total money spend: %.2f%n", sum);

    }
}
