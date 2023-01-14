package _09_Arrays_More_Ex;

import java.util.Scanner;

public class _02_PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = Integer.parseInt(scanner.nextLine());

        if (row <= 60 && row >= 1) {
            int x = 1, y = 0;
            int[] arr = new int[row];
            int[] arrTemp = new int[row];
            arr[0] = 1;
            arr[1] = 1;

            for (int i = 0; i < row; i++) {
                for (int j = (row - 1); j > i; j--)
                    System.out.print(" ");
                for (int j = 0; j <= i; j++) {
                    if (i == 0)
                        System.out.print("1");
                    else {
                        if (j == 0 || j == i)
                            System.out.print("1 ");
                        else {
                            arrTemp[x] = arr[y] + arr[y + 1];
                            System.out.print(arrTemp[x] + " ");
                            x++;
                            y++;
                        }
                    }
                }
                System.out.print("\n");
                arrTemp[x] = 1;
                if (i > 1) {
                    y = 0;
                    arr[y] = 1;
                    for (x = 1, y = 1; y <= i; x++, y++)
                        arr[y] = arrTemp[x];
                    x = 1;
                    y = 0;
                }
            }
        }
    }

}


