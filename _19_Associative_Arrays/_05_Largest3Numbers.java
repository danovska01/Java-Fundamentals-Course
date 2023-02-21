package _19_Associative_Arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.util.Comparator.*;

public class _05_Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Read a list of integers and print largest 3 of them. If there are less than 3, print all of them.

        String[] input = scanner.nextLine().split(" ");
        Arrays.stream(input)
                .map(Integer::parseInt)
                .sorted((n1, n2) -> n2.compareTo(n1)) // sorted(Comparator.reverseOrder())
                .limit(3)
                .collect(Collectors.toList()).forEach(System.out::println);


    }
}
