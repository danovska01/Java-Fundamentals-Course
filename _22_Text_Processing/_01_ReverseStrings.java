package _22_Text_Processing;

import java.util.Scanner;

public class _01_ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();


        while (!"end".equals(input)){

            String reversed= "";
            for (int i = input.length()-1; i >=0 ; i--) {
                reversed+=input.charAt(i);
            }
            System.out.printf("%s = %s%n", input,reversed);
            input= scanner.nextLine();
        }
    }
}
