package _04_DataTypesAndVariables;

import java.util.Scanner;

public class _10_SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // A number is special when its sum of digits is 5, 7, or 11.

        int number = Integer.parseInt(scanner.nextLine());
        int sum=0;


        for (int checkedNum=1; checkedNum<=number; checkedNum++){
            int changedNumber = checkedNum;

           while (changedNumber>0){
            int digit = changedNumber%10;
            sum+=digit;
            changedNumber/=10;
        }
        if (sum==5 || sum==7 || sum==11){
            System.out.printf("%d -> True%n", checkedNum);
        }
        else {
            System.out.printf("%d -> False%n", checkedNum);
        }
        sum=0;
        }

    }
}
