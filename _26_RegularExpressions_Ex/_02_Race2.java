package _26_RegularExpressions_Ex;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class _02_Race2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regexName ="(?<symbol>[A-Za-z])";
        String regexDistance= "(?<distance>[0-9])";

        List<String> names = List.of(scanner.nextLine().split(", "));
        Map<String, Integer> racersDistances = new HashMap<>();
        for (int i = 0; i < names.size(); i++) {
            racersDistances.put(names.get(i),0 );
        }

        String input = scanner.nextLine();

        while (!input.equals("end of race")){
            StringBuilder nameBuilder = new StringBuilder();
            int distance = 0;

        Pattern patternName = Pattern.compile(regexName);
        Matcher matcherName = patternName.matcher(input);

        while (matcherName.find()){
            nameBuilder.append(matcherName.group("symbol"));

        }
            Pattern patternDistance = Pattern.compile(regexDistance);
            Matcher matcherDistance = patternDistance.matcher(input);

            while (matcherDistance.find()){
            distance+=Integer.parseInt(matcherDistance.group("distance"));
        }
            String racersName = nameBuilder.toString();
        if(racersDistances.containsKey(racersName)){
            int newDistance = racersDistances.get(racersName)+ distance;
            racersDistances.put(racersName, newDistance);
        }

        input=scanner.nextLine();
        }
        // racersDistances.entrySet().stream().sorted(e1, e2 -> e2.getValue().compareTo().e1.gerValue()
        List <String> firstThreeNames = racersDistances.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3)
                .map(entry->entry.getKey())
                .collect(Collectors.toList());

        System.out.println("1st place: "+ firstThreeNames.get(0));
        System.out.println("2nd place: "+ firstThreeNames.get(1));
        System.out.println("3rd place: "+ firstThreeNames.get(2));

    }
}
