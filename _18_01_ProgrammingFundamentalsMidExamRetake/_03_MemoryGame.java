package _18_01_ProgrammingFundamentalsMidExamRetake;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _03_MemoryGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = Arrays.stream(sc.nextLine().split(" "))
                .collect(Collectors.toList());

        String command = sc.nextLine();
        boolean isWon = false;
        int count = 0;
        while(!command.equals("end")){
            String currentIntegers [] = command.split(" ");
            int first = Integer.parseInt(currentIntegers[0]);
            int second = Integer.parseInt(currentIntegers[1]);
            if(list.isEmpty()){
                isWon = true;
                break;
            }else if(first == second || first < 0 || second < 0 || first >= list.size() || second >= list.size()){
                count++;
                System.out.println("Invalid input! Adding additional elements to the board");
                int middle = list.size()/2;
                String elementToAdd = "-" + count + "a";
                list.add(middle, elementToAdd);
                list.add(middle, elementToAdd);
            }
            else if(list.get(first).equals(list.get(second))){
                count++;
                System.out.printf("Congrats! You have found matching elements - %s!\n", list.get(first));
                int firstToRemove = 0;
                int secondToRemove = 0;
                if(first < second){
                    firstToRemove = first;
                    secondToRemove = second - 1;
                }else if(first > second){
                    firstToRemove = second;
                    secondToRemove = first - 1;
                }
                list.remove(firstToRemove);
                list.remove(secondToRemove);
                if(list.isEmpty()){
                    isWon = true;
                    break;
                }
            }else if(!list.get(first).equals(list.get(second))){
                count++;
                System.out.println("Try again!");
            }
            command = sc.nextLine();
        }

        if(isWon){
            System.out.printf("You have won in %d turns!", count);
        }else if(command.equals("end")){
            System.out.println("Sorry you lose :(");
            for(String k: list){
                System.out.print(k + " ");
            }

        }

    }
}
