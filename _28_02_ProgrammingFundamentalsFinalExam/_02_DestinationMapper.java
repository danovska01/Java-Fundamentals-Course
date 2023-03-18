package _28_02_ProgrammingFundamentalsFinalExam;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _02_DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<String >listOfDestinations= new LinkedList<>();
        int points=0;


        String regex = "(?<sign>[=\\/]{1})(?<destination>[A-Z][A-Za-z]{2,})(\\1)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()){
            String currentDestination= matcher.group("destination");
            int currentPoints= currentDestination.length();
            listOfDestinations.add(currentDestination);
            points+=currentPoints;

        }
        String destinations = String.join(", ", listOfDestinations);

        System.out.println("Destinations: "+ destinations);
        System.out.println("Travel Points: "+ points);

    }
}
