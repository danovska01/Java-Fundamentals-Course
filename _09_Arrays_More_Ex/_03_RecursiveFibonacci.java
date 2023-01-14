package _09_Arrays_More_Ex;

import java.util.Scanner;

public class _03_RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());

            if (length==1){
                System.out.println(1);
                return;
            }
            if (length <= 0) {
                System.out.println(0);
                return;
            }
        int [] fibonacci = new int[length];
        fibonacci[0]= fibonacci[1]=1;

        for (int i = 2; i < fibonacci.length; i++) {
            fibonacci[i]= fibonacci[i-1]+ fibonacci[i-2];
        }

            System.out.print(fibonacci[fibonacci.length-1]);

    }
    }

