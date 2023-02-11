package _18_04_ProgrammingFundamentalsMidExamRetake;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _02_ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> products = Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());
        String command = scanner.nextLine();
        while ((!command.equals("Go Shopping!"))){
            String [] tokens = command.split(" ");
            String toDo = tokens[0];
            String item = tokens[1];
            boolean ifItemExists= ifExists (item, products);
            int index=index(item, products);

            switch (toDo){
                case "Urgent":
                    //"Urgent {item}" - add the item at the start of the list.  If the item already exists, skip this command.

                    if(!ifItemExists){
                        //products.set(0, item); !!!!!! - NE E VQRNO TAKA
                        List <String> copyOfList = new ArrayList<>();
                        copyOfList.add(item);
                        copyOfList.addAll(products);
                        products = copyOfList;
                    }
                    break;
                case "Unnecessary":
                    //Unnecessary {item}" - remove the item with the given name,
                    // only if it exists in the list. Otherwise, skip this command
                    if(ifItemExists){
                        products.remove(item);
                    }

                    break;
                case "Correct":
                    //Correct {oldItem} {newItem}" - if the item with the given old name exists,
                    // change its name with the new one. Otherwise, skip this command
                    if(ifItemExists){
                        String newItem= tokens[2];
                            //int indexx = products.indexOf(item);
                        products.set(index, newItem);


                    }
                    break;
                case "Rearrange":
                    //Rearrange {item}" - if the grocery exists in the list, remove it from its current
                    // position and add it at the end of the list. Otherwise, skip this command.
                    if(ifItemExists){
                        products.remove(index);
                        products.add(item);

                    }
                    break;
                default:
                    break;
            }


            command= scanner.nextLine();

        }
        for(int i=0; i<products.size(); i++){
            System.out.print(products.get(i));
            if (i != products.size() - 1) {
                System.out.print(", ");
            }
        }


    }

    private static int index(String item, List<String> products) {
        for (int i = 0; i < products.size(); i++) {
            if(item.equals(products.get(i))){
                return i;
            }
        }
       return 0;
    }

    private static boolean ifExists(String item, List<String> products) {
        for (int i = 0; i < products.size(); i++) {
            if(item.equals(products.get(i))){
                return true;
            }
        }
        return false;
    }
}
