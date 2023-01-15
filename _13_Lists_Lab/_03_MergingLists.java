package _13_Lists_Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _03_MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);


        String input1= scanner.nextLine();
        String input2= scanner.nextLine();

        List<Integer> list1 = Arrays.stream(input1.split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        // Може и направо така.......
        // List<Integer> list1 = Arrays.stream(scanner.nextLine().split(" "))
        // .map(Integer::parseInt).collect(Collectors.toList());

        List <Integer> list2 = Arrays.stream(input2.split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int smallListSize = Math.min(list1.size(), list2.size());
        for (int i = 0; i < smallListSize; i++) {
            System.out.print(list1.get(i) + " " + list2.get(i) + " ");
        }

        printTheRest (list1, smallListSize);
        printTheRest (list2, smallListSize);
        // ... или може да проверим кой е по-големият списък и да викнем метода за по-ГОЛЕМИЯ списък
        // if (list1.size()>list2.size()){
        // printTheRest(list1, smallListSize);
        // else {
        // printTheRest(list2, smallListSize);
        // }

    }

    private static void printTheRest(List<Integer> list, int beginIndex) {
        for (int i = beginIndex; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
            
        }
    }
}
