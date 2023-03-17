package _28_01_ProgrammingFundamentalsFinalExam;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _02_AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        // #Bread#19/03/21#4000#
        // |Carrots|06/08/20|500|
        //String regex = "(?<sign>\\#*\\|*)(?<nameItem>[A-Za-z]*\\s?[A-Za-z]*)(\\1)(?<expDate>\\d{2}\\/\\d{2}\\/\\d{2})(\\1)(?<calories>\\d*)(\\1)";
        String regex = "(?<symbols>[#\\|])(?<name>[A-za-z\\s]+)(\\1)(?<date>[0-9]{2}[\\/][0-9]{2}[\\/][0-9]{2})(\\1)(?<calories>[\\d]{1,5})(\\1)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        int totalCalories= 0;
        Map<String,String> foodDate = new LinkedHashMap<>();
        Map<String,Integer> foodCalories = new LinkedHashMap<>();
        List<String> items = new LinkedList<>();

        while (matcher.find()){


            String nameOfItem = matcher.group("name");
            String expirationDate = matcher.group("date");
            int calories = Integer.parseInt(matcher.group("calories"));

            foodDate.putIfAbsent(nameOfItem,expirationDate);
            foodCalories.putIfAbsent(nameOfItem,calories);
            totalCalories += calories;  //change
            items.add(String.format("Item: %s, Best before: %s, Nutrition: %d%n", nameOfItem,expirationDate,calories));

        }
        //int sum = 0;
        /*for (Map.Entry<String, Integer> entry:foodCalories.entrySet()) {

            sum += entry.getValue();
        }*/

        System.out.printf("You have food to last you for: %d days!%n", totalCalories/2000); //change


        items.forEach(System.out::print);

    }


}
