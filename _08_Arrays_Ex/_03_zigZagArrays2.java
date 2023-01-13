package _08_Arrays_Ex;

import java.util.Scanner;

public class _03_zigZagArrays2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int [] arr1 = new int [n];
        int [] arr2 = new int [n];
        // четен ред: Перво число (втори масив); Второ Число (първи масив);
        // нечетен ред: Първо число (първи масив); Второ число (втори масив);
        for (int row = 0; row < n; row++) {
            String input = scanner.nextLine();
            int firstNumber = Integer.parseInt(input.split(" ")[0]);
            int secondNumber = Integer.parseInt(input.split(" ")[1]);
            // проверка дали е четен редът
            if ((row+1)%2==0){
                arr1 [row]=secondNumber;
                arr2 [row]=firstNumber;
            }
            else {
                arr1[row]=firstNumber;
                arr2[row]=secondNumber;
            }
        }
        for (int number:arr1){
            System.out.print(number + " ");
        }
        System.out.println();
        for (int number:arr2){
            System.out.print(number + " ");
        }
    }
}
