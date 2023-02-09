package _18_02_ProgrammingFundamentalsMidExamRetake;

import java.util.Scanner;

public class _01_SoftUniReception {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //     • On the first three lines -  each employee efficiency -  integer in the range [1 - 100]
        //    • On the fourth line - students count – integer in the range [0 – 10000]
        //    • Input will always be valid and in the range specified



        int capacity = 0;
        for (int i = 1; i <= 3; i++) {
            int currentCapacity = Integer.parseInt(sc.nextLine());
            capacity += currentCapacity;
        }
        int studentsCount = Integer.parseInt(sc.nextLine());
        int count = 0;
        while(studentsCount != 0){
            if(count == 0){
                count = 1;
            };
            if(studentsCount > capacity){
                studentsCount -= capacity;
            }else{
                break;
            }
            count++;
            if(count % 4 == 0){
                count++;
            }
        }
        System.out.printf("Time needed: %dh.", count);
    }
}
