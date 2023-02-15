package _18_05_ProgrammingFundamentalsMidExamRetake;

import java.util.Scanner;

public class _01_BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberStudents = Integer.parseInt(scanner.nextLine());
        int numberLectures = Integer.parseInt(scanner.nextLine());
        int bonus = Integer.parseInt(scanner.nextLine());
        int maxBonus=0;
        int maxStudentLectures=0;

        for (int i = 1; i <= numberStudents; i++) {
            int attendance = Integer.parseInt(scanner.nextLine());
            //{total bonus} = {student attendances} / {course lectures} * (5 + {additional bonus})
            double totalBonus= attendance*1.0/numberLectures * (5+bonus);
            totalBonus = Math.ceil(totalBonus);
            int result = (int)totalBonus;
            if(totalBonus>=maxBonus){
                maxBonus=result;
                maxStudentLectures=attendance;
            }


        }
        System.out.printf("Max Bonus: %d.%n",maxBonus );
        System.out.printf("The student has attended %d lectures.", maxStudentLectures);
    }
}
