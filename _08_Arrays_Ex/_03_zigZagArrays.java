package _08_Arrays_Ex;

import java.util.Scanner;

public class _03_zigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write a program which creates 2 arrays. You will be given an integer n.
        // On the next n lines, you get 2 integers. Form 2 arrays as shown below.
        /*4
        1 5
        9 10
        31 81
        41 20*/


        int n = Integer.parseInt(scanner.nextLine());
        int [] first = new int [n];
        int [] second = new int [n];

        for (int i = 0; i < n; i++) {
            String current = scanner.nextLine();
            int firstNumCurrent = Integer.parseInt(current.substring(0, current.indexOf(" ")));
            int secondCurrent = Integer.parseInt(current.substring(current.indexOf(" ")+1, current.length()));
            if(i % 2 != 0){
                first[i] = firstNumCurrent;
                second[i] = secondCurrent;

            }else{
                first[i] = secondCurrent;
                second[i] = firstNumCurrent;

            }
        }
        for (int i = 0; i < 2; i++) {
            int currentArr [] = new int[0];
            switch (i){
                case 1:
                    currentArr = first;
                    break;
                case 0:
                    currentArr = second;
                    break;
                default:
                    break;
            }
            for (int j = 0; j < currentArr.length; j++) {
                System.out.print(currentArr[j] + " ");
            }
            System.out.println();
        }





                }
            }







