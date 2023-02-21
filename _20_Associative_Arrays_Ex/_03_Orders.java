package _20_Associative_Arrays_Ex;

import java.util.*;

public class _03_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //You will receive products' names, prices and quantities on new lines. Until you receive the command "buy", keep adding items. When you do receive the command "buy"

        String command = scanner.nextLine();
        Map<String, List<Double>> listProducts = new LinkedHashMap<>();
        while (!command.equals("buy")) {

            String[] newProductProperties = command.split(" ");
            String product = newProductProperties[0];
            double price = Double.parseDouble(newProductProperties[1]);
            double quantity = Double.parseDouble(newProductProperties[2]);
            ArrayList<Double> currentProductProperties = new ArrayList<>();
            currentProductProperties.add(price);
            currentProductProperties.add(quantity);

            if (!listProducts.containsKey(product)) {
                listProducts.put(product, currentProductProperties);
            }
            //if you receive a product, which already exists, increase its quantity by the input quantity and if its price is different, replace the price as well.
            else {
                currentProductProperties.set(1, listProducts.get(product).get(1) + quantity);
                if (currentProductProperties.get(0) != price) {
                    currentProductProperties.set(0, price);
                }

                listProducts.put(product, currentProductProperties);

            }


            command = scanner.nextLine();
        }

        for (Map.Entry<String, List<Double>> entry : listProducts.entrySet()) {
            List<Double> x = entry.getValue();
            double number = x.get(0) * x.get(1);
            System.out.printf("%s -> %.2f%n", entry.getKey(), number);

        }

    }
}
