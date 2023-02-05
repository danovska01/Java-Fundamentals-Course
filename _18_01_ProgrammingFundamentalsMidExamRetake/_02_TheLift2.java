package _18_01_ProgrammingFundamentalsMidExamRetake;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _02_TheLift2 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int numberPeople = Integer.parseInt(sc.nextLine());
        List<Integer> list = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        for (int i = 0; i < list.size(); i++) {
            for (int j = list.get(i); j < 4; j++) {
                if(numberPeople == 0){
                    break;
                }
                list.set(i, list.get(i) + 1);
                numberPeople--;
            }
            if(numberPeople == 0){
                break;
            }
        }
        if(numberPeople == 0 && list.get((list.size() - 1)) != 4){
            System.out.println("The lift has empty spots!");
            printPlaces(list);
        }else if(list.get((list.size() - 1)) == 4 && numberPeople > 0){
            System.out.printf("There isn't enough space! %d people in a queue!\n", numberPeople);
            printPlaces(list);
        }else{
            printPlaces(list);
        }

    }
    static void printPlaces(List <Integer> list){
        for(int i: list){
            System.out.print(i + " ");
        }
    }
}
