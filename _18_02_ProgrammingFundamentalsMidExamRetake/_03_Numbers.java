package _18_02_ProgrammingFundamentalsMidExamRetake;

import java.util.*;
import java.util.stream.Collectors;

public class _03_Numbers  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write a program to read a sequence of integers and find and print the top 5
        // numbers greater than the average value in the sequence, sorted in descending order.

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        double averageValue= averageFinder(numbers);

        List<Integer> newNumbers = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i)<=averageValue){
                numbers.remove(numbers.get(i));
                i-=1;
            }
        }
        Collections.sort(numbers);
        Collections.reverse(numbers);
        if(numbers.size()<1){
            System.out.println("No");
        }
        if(numbers.size()>5){
        for (int i = 0; i < 5; i++) {
            newNumbers.add(numbers.get(i));
        }
            print(newNumbers);
        }
        else{
            print(numbers);
        }




    }

    private static void print(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            System.out.printf("%d ", numbers.get(i));

        }

    }

    private static double averageFinder(List<Integer> numbers) {

        double sum=0;
        for (int i = 0; i < numbers.size(); i++) {
            sum+=numbers.get(i);
        }
        double averageValue= (sum/numbers.size());

        return averageValue;
    }
}
