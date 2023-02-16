package _18_06_ProgrammingFundamentalsMidExamRetake;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        List<String> newList= new ArrayList<>();
        String text = scanner.nextLine();
        int index= Integer.parseInt(scanner.nextLine());
        newList.set(index, text);


        for (int i = 0; i < list.size(); i++) {
            newList.set(index, text);

        }
        for (String text1:newList){
            System.out.print(text1+ " ");
        }
    }
}
