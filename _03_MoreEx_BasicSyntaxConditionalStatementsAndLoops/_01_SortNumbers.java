package _03_MoreEx_BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class _01_SortNumbers {
    public static <DescendingOrder> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Read three real numbers and sort them in descending order. Print each number on a new line.

       int x = Integer.parseInt(scanner.nextLine());
       int y = Integer.parseInt(scanner.nextLine());
       int z = Integer.parseInt(scanner.nextLine());
       if (x>y&&y>z&&x>z){
           System.out.printf("%d%n%d%n%d%n", x, y, z);
       }
        if (x>y&&z>y&&x>z){
          System.out.printf("%d%n%d%n%d%n", x, z, y);
        }
        if (y>x&& x>z && y>z){
            System.out.printf("%d%n%d%n%d%n", y, x, z);
        }
        if (y>z&&z>x&&y>z){
            System.out.printf("%d%n%d%n%d%n", y, z, x);
        }
        if (z>x&&x>y&&z>y){
            System.out.printf("%d%n%d%n%d%n", z, x, y);
        }
        if (z>y&&y>x&&z>x){
            System.out.printf("%d%n%d%n%d%n", z, y, x);
        }
        if (x>y && y==z){
            System.out.printf("%d%n%d%n%d%n", x, y, z);
        }
        if (y>x && x==z){
            System.out.printf("%d%n%d%n%d%n", y, x, z);
        }
        if (z>x && x==y){
            System.out.printf("%d%n%d%n%d%n", z, x, y);
        }



    }
}
