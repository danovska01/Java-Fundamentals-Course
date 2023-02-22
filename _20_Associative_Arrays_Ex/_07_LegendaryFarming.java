package _20_Associative_Arrays_Ex;

import java.util.*;

public class _07_LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] line;

        Map<String, Integer> specialItems = new HashMap<>();
        Map<String, Integer> junk = new TreeMap<>();

        int quantity;
        String item;
        boolean breakable = false;

        specialItems.put("shards", 0);
        specialItems.put("fragments", 0);
        specialItems.put("motes", 0);

        while (true) {
            line = scanner.nextLine().split(" ");
            for (int i = 0; i < line.length; i++) {
                if (i % 2 == 0) {
                    quantity = Integer.parseInt(line[i]);
                    item = line[i + 1];
                } else {
                    continue;
                }
                item = item.toLowerCase();
                if (item.equals("shards") || item.equals("fragments") || item.equals("motes")) {
                    specialItems.put(item, specialItems.get(item) + quantity);
                    if (specialItems.get(item) >= 250) {
                        specialItems.put(item, specialItems.get(item) - 250);
                        if (item.equals("shards")) {
                            System.out.println("Shadowmourne obtained!");
                        }
                        if (item.equals("fragments")) {
                            System.out.println("Valanyr obtained!");
                        }
                        if (item.equals("motes")) {
                            System.out.println("Dragonwrath obtained!");
                        }
                        breakable = true;
                        break;
                    }
                } else {
                    if (!junk.containsKey(item)) {
                        junk.put(item, 0);
                    }
                    junk.put(item, junk.get(item) + quantity);
                }
            }
            if (breakable == true) {
                break;
            }
        }

        Map<Integer, String> specialItemsTree = new TreeMap<>(Collections.reverseOrder());

        specialItemsTree.put(specialItems.get("shards"), "shards");
        specialItemsTree.put(specialItems.get("fragments"), "fragments");
        specialItemsTree.put(specialItems.get("motes"), "motes");

        for (Map.Entry<Integer, String> entry : specialItemsTree.entrySet()) {
            System.out.println(entry.getValue() + " " + entry.getKey());
        }

        for (Map.Entry<String, Integer> entry : junk.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());

        }

    }
}
