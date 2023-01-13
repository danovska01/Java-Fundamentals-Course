package _08_Arrays_Ex;

import java.util.Scanner;

public class _01_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // You will be given a count of wagons in a train n. On the next n lines, you will receive how many
        // people are going to get on that wagon. At the end print the whole train and after that the sum of the
        // people in the train.

        int n = Integer.parseInt(scanner.nextLine());
        int [] peopleInWagon = new int [n];
        for (int i=0; i<n; i++){
            peopleInWagon [i] = Integer.parseInt(scanner.nextLine());

            //int number = Integer.parseInt(scanner.nextLine());
            //peopleInWagon[i]=number;
        }
        int sum = 0;
        for(int i : peopleInWagon){
            System.out.print(i + " ");
        sum+=i;
        }
        System.out.println();
        System.out.printf("%d", sum);






    }
}
