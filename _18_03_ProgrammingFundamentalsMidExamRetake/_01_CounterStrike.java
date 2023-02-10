package _18_03_ProgrammingFundamentalsMidExamRetake;

import java.util.Scanner;

public class _01_CounterStrike {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int initialEnergy= Integer.parseInt(scanner.nextLine());
        int energyLeft= initialEnergy;
        String command= scanner.nextLine();
        int countWon=0;
        while (!command.equals("End of battle")){
            int energy= Integer.parseInt(command);
            if(energyLeft>=energy){
                energyLeft-=energy;
                countWon++;
            }
            else {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", countWon, energyLeft);
                break;
            }
            if(countWon%3==0){
                //Every third won battle increases your energy with the value of your current count of won battles.
                energyLeft+=countWon;
            }

            command=scanner.nextLine();
        }
        if(command.equals("End of battle")){
            System.out.printf("Won battles: %d. Energy left: %d", countWon, energyLeft);
        }
    }
}
