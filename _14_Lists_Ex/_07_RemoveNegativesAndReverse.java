package _13_Lists_Lab;

import java.util.*;
import java.util.stream.Collectors;

public class _07_RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read a list of integers, remove all negative numbers from it and print the remaining elements in reversed order.
        // In case of no elements left in the list, print "empty".
        // input: 10 -5 7 9 -33 50
        // output: 50 9 7 10

        String input = scanner.nextLine();
        List<Integer> listNumbers = Arrays.stream(input.split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        for (int i = 0; i < listNumbers.size(); i++) {
            int currentNumber= listNumbers.get(i);
            if (currentNumber<0){
             listNumbers.remove(Integer.valueOf(currentNumber));
             i--;
            }
        }
        if (listNumbers.size()<1){
            System.out.println("empty");
        }
        int halfsize = listNumbers.size()/2;
        for(int i =0; i<halfsize; i++){
            int old = listNumbers.get(i);
            listNumbers.set(i, listNumbers.get(listNumbers.size()-1-i));
            listNumbers.set(listNumbers.size()-1-i, old);

        }
        for(int number: listNumbers){
        System.out.print(number + " ");
        }

    }
}
