package _18_05_ProgrammingFundamentalsMidExamRetake;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _03_Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //You will receive a journal with some collecting items, separated with a comma and a space (", ").
        // After that, until receiving "Craft!" you will be receiving different commands split by " - ":

        List<String> inventory = new java.util.ArrayList<>(List.of(scanner.nextLine().split(", ")));
        String input = scanner.nextLine();

        while (!input.equals("Craft!")){
            String [] inputArr = input.split(" - ");
            String command = inputArr[0];
            String item = inputArr[1];

            switch (command){
                case "Collect":
                    // you should add the given item to your inventory. If the item already exists, you should skip this line.
                    if(!inventory.contains(item)){
                        inventory.add(item);
                    }
                    break;
                case "Drop":
                    //you should remove the item from your inventory if it exists.
                    inventory.remove(item);

                    break;
                case "Combine Items":
                    //you should check if the old item exists. If so, add the new item after the old one.
                    // Otherwise, ignore the command.
                    String items= inputArr[1];
                    String [] twoItems = items.split(":");
                    String firstItem= twoItems[0];
                    String secondItem= twoItems[1];
                    if(inventory.contains(firstItem)){
                        setNewItem(firstItem,secondItem, inventory);
                    }
                    break;
                case "Renew":
                    //if the given item exists, you should change its position and put it last in your inventory.
                    if(inventory.contains(item)){
                        inventory.remove(item);
                       inventory.add(item);
                    }

                    break;
            }


            input=scanner.nextLine();
        }
        // After receiving "Craft!" print the items in your inventory, separated by ", ".
        /*for (int i=0; i<inventory.size()-1; i++) {
            System.out.print(inventory.get(i) + ", ");
        }
        System.out.print(inventory.get(inventory.size()-1));*/

        String result = String.join(", ", inventory);
        System.out.println(result);

    }

    private static void setNewItem(String firstItem, String secondItem, List<String> inventory) {
        int index=0;
        for (int i = 1; i < inventory.size(); i++) {

            if(inventory.get(i).equals(firstItem)){
                index=i;
            }

        }
        if (index+1<inventory.size()){
        inventory.set(index+1, secondItem);
    }
        else {
            inventory.add(secondItem);
        }
    }
}
