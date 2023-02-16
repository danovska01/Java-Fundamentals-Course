package _18_06_ProgrammingFundamentalsMidExamRetake;

import java.util.*;
import java.util.stream.Collectors;

public class _02_TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        List<String> thisList = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("Yohoho!")) {

            String command = input.split(" ")[0];

            switch (command) {
                case "Loot":
                    //Insert the items at the beginning of the chest. If an item is already contained, don't insert it.
                    String[] items = input.split(" ");
                    List<String> newList = new ArrayList<>();
                    for (int i = items.length - 1; i > 0; i--) {
                        if (!list.contains(items[i])) {
                            newList.add(items[i]);
                        }
                    }
                    for (String s : list) {
                        newList.add(s);
                    }
                    list = newList;
                    break;


                case "Drop":
                    // "Drop {index}. Remove the loot at the given position and add it at the end of the treasure chest.
                    //If the index is invalid, skip the command.
                    int index = Integer.parseInt(input.split(" ")[1]);
                    if (index >= 0 && index <= list.size()) {
                        String oldItem = list.get(index);
                        list.remove(list.get(index));

                        list.add(oldItem);
                    }
                    break;


                case "Steal":
                    //command "Steal count (3)" removes the last (3) count items Medallion, Cup, Gold from the chest and prints them.
                    // If there are fewer items than the given count, remove as much as there are.
                    // Print the stolen items separated by ", "
                    int count = Integer.parseInt(input.split(" ")[1]);

                    if (count > 0 && count <= list.size()) {
                        for (int i = 1; i <= count; i++) {
                            thisList.add(list.get(list.size() - 1));
                            list.remove(list.get(list.size() - 1));
                        }
                    }
                    if (count >= list.size()) {
                        for (int i = 1; i <= list.size(); i++) {
                            thisList.add(list.get(list.size() - 1));
                            list.remove(list.get(list.size() - 1));
                        }
                    }
                    break;
            }
            input = scanner.nextLine();

        }
        Collections.reverse(thisList);
        String result = String.join(", ", thisList);
        System.out.println(result);

        int counter = 0;
        for (int i = 0; i < list.size(); i++) {
            String currentWord = list.get(i);
            int length = currentWord.length();
            counter += length;

        }
        if (list.size()==0){
            System.out.println("Failed treasure hunt.");
        }
        else {
        System.out.printf("Average treasure gain: %.2f pirate credits.", counter * 1.0 / list.size());
        }


    }
}
