package _20_Associative_Arrays_Ex;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _02_AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Until you receive "stop" command, you will be given a sequence of strings, each on a new line.
        // Every odd line on the console is representing a resource (e.g. Gold, Silver, Copper, etc.) and every even - quantity.
        // Your task is to collect the resources and print them each on a new line.
        //Print the resources and their quantities in format: {resource} –> {quantity}

        Map<String, Integer> listResourcesAndTheQuantity = new LinkedHashMap<>();
        String resorce = scanner.nextLine();

        while (!resorce.equals("stop")) {
            int quantity = Integer.parseInt(scanner.nextLine());

            if (!listResourcesAndTheQuantity.containsKey(resorce)) {
                listResourcesAndTheQuantity.put(resorce, quantity);

            } else {
                int currentQuantity = listResourcesAndTheQuantity.get(resorce);
                listResourcesAndTheQuantity.put(resorce, currentQuantity + quantity);
            }

            resorce = scanner.nextLine();

        }

        for (Map.Entry<String, Integer> entry : listResourcesAndTheQuantity.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
