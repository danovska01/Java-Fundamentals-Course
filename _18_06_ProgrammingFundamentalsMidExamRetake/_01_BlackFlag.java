package _18_06_ProgrammingFundamentalsMidExamRetake;

import java.util.Scanner;

public class _01_BlackFlag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int dailyPlunger = Integer.parseInt(scanner.nextLine());
        double expectedPlunger = Double.parseDouble(scanner.nextLine());

        //If the gained plunder is more or equal to the target, print the following:
        //"Ahoy! {totalPlunder} plunder gained."
        int dayCount = 0;
        double totalGain = 0;


        for (int i = 1; i<=days; i++){
            dayCount++;

            if (dayCount%3==0){
                totalGain+=1.5*dailyPlunger;
            }
            else {
                totalGain+=dailyPlunger;
            }
            if (dayCount%5==0){
                totalGain=totalGain-totalGain*0.3;
            }


        }
        if(expectedPlunger<=totalGain){
            System.out.printf("Ahoy! %.2f plunder gained.", totalGain);
        }
        else {
            System.out.printf("Collected only %.2f%% of the plunder.", totalGain/expectedPlunger*100);
        }




    }
}
