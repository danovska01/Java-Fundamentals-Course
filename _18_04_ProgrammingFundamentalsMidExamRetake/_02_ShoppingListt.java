package _18_04_ProgrammingFundamentalsMidExamRetake;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _02_ShoppingListt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> products = Arrays.stream(sc.nextLine().split("!")).collect(Collectors.toList());

        //      Arrays.asList(sc.nextLine().split("!"));

        String command = sc.nextLine();
        while(!command.equals("Go Shopping!")){
            String [] tokens = command.split("\\s+");
            switch(tokens[0]){
                case "Urgent":
                    String currentProduct = tokens[1];
                    if(!products.contains(currentProduct)){
                        List <String> copyOfList = new ArrayList<>();
                        copyOfList.add(currentProduct);
                        copyOfList.addAll(products);
                        products = copyOfList;
                        //    print(products);
                    };
                    break;
                case "Unnecessary":
                    String currentItem = tokens[1];
                    products.remove(currentItem);
                    break;
                case "Correct":
                    String oldName = tokens[1];
                    String newName = tokens[2];
                    if(products.contains(oldName)){
                        int index = products.indexOf(oldName);
                        products.set(index, newName);
                    }
                    break;
                case "Rearrange":
                    String name = tokens[1];
                    if(products.contains(name)){
                        products.remove(name);
                        products.add(name);
                    }
                    break;
                default:
                    break;
            }


            command = sc.nextLine();
        }
        String joined = String.join(", ", products);
        System.out.println(joined);
    }

    static void print(List<String> list){
        list.forEach(e-> System.out.print(e + " "));
    }


    //  ddd!hh!k
    //  Urgent ddd
    //  Urgent hh
    //  Urgent oo

}
