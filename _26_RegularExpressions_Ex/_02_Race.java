package _26_RegularExpressions_Ex;

import java.util.*;
import java.util.stream.Collectors;

public class _02_Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> names = List.of(scanner.nextLine().split(", "));
        Map<String, Integer> players = new HashMap<>();
        for (int i = 0; i < names.size(); i++) {
            players.put(names.get(i),0 );

        }
        StringBuilder currentName = new StringBuilder();
        int sum = 0;
        String input = scanner.nextLine();
        while (!input.equals("end of race")){
            for (int i = 0; i < input.length(); i++) {
                char currentChar = input.charAt(i);
                if(Character.isLetter(currentChar)){
                    currentName.append(currentChar);
                }
                if(Character.isDigit(currentChar)){
                    sum+=Integer.parseInt(String.valueOf(currentChar));
                }
            }
            String thisName = String.valueOf(currentName);
            if(players.containsKey(thisName)){
                int newSum = players.get(thisName)+ sum;
                players.put(String.valueOf(thisName), newSum);
            }

            sum=0;
            currentName.setLength(0);

            input=scanner.nextLine();
        }
        List <Integer> list = new ArrayList<>();
        Map sortedMap = new LinkedHashMap();

        for (Map.Entry<String, Integer> entry : players.entrySet()) {
            list.add(entry.getValue());
        }
        Collections.sort(list);
        Collections.reverse(list);
        for (int num : list) {
            for (Map.Entry<String, Integer> entry : players.entrySet()) {
                if (entry.getValue().equals(num)) {
                    sortedMap.put(entry.getKey(), num);
                }
            }
        }
        System.out.println(sortedMap);

    }
}
