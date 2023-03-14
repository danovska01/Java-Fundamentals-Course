package _26_RegularExpressions_Ex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _03_SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Each valid order should have a customer, product, count and a price
        //%George%<Croissant>|2|10.3$
        String regex = "%([A-Z][a-z]+)%[^|$%.]*<(\\w+)>[^|$%.]*\\|([0-9]+)\\|[^|$%.]*?([0-9]+\\.?[0-9]*)\\$";
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile(regex);
        double totalIncome=0;
        while (!input.equals("end of shift")){

            Matcher matcher = pattern.matcher(input);
            if (matcher.find()){
                String name = matcher.group(1);
                String product = matcher.group(2);
                int count = Integer.parseInt(matcher.group(3));
                double price = Double.parseDouble(matcher.group(4));

                double currentMoney = price*count;
                //For each valid line print on the console: "{customerName}: {product} - {totalPrice}"
                System.out.printf("%s: %s - %.2f%n", name, product, currentMoney);
                totalIncome+=currentMoney;

            }

            input= scanner.nextLine();

        }
        System.out.printf("Total income: %.2f%n", totalIncome);
    }
}
