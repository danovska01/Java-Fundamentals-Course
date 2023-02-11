package _18_04_ProgrammingFundamentalsMidExamRetake;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _03_HeartDelivery2 {
    static int indexToDecrease = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> neighbourhood = Arrays.stream(sc.nextLine().split("@"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = sc.nextLine();


        while(!command.equals("Love!")){
            int jump = Integer.parseInt(command.split(" ")[1]);
            indexToDecrease = giveIndexToStep(neighbourhood, jump);
            action(neighbourhood, indexToDecrease);
            command = sc.nextLine();
        }

        System.out.printf("Cupid's last position was %d.\n", indexToDecrease);
        String isAllHaveValentineDay = isComplete(neighbourhood) ?
                "Mission was successful."
                : String.format("Cupid has failed %d places.", getLeftHouses(neighbourhood));
        System.out.println(isAllHaveValentineDay);
    }

    private static int getLeftHouses(List<Integer> neighbourhood) {
        int count = 0;
        for(Integer i : neighbourhood){
            if(i != 0){
                count++;
            }
        }
        return count;
    }

    private static boolean isComplete(List<Integer> neighbourhood) {
        boolean isNotBreak = true;
        for(Integer i : neighbourhood){
            if(i != 0){
                isNotBreak = false;
                break;
            }
        }
        return isNotBreak;
    };

    private static void action(List<Integer> neighbourhood, int indexToDecrease) {
        if(neighbourhood.get(indexToDecrease) == 0){
            System.out.printf("Place %d already had Valentine's day.\n", indexToDecrease);
            return;
        }
        neighbourhood.set(indexToDecrease, neighbourhood.get(indexToDecrease) - 2);
        if(neighbourhood.get(indexToDecrease) == 0){
            System.out.printf("Place %d has Valentine's day.\n", indexToDecrease);
        }
    }

    private static int giveIndexToStep(List<Integer> neighbourhood, int jump) {
        if(indexToDecrease + jump >= neighbourhood.size()){
            return 0;
        }else{
            return indexToDecrease + jump;
        }

    }
}
