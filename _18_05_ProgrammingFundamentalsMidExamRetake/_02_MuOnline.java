package _18_05_ProgrammingFundamentalsMidExamRetake;

import java.util.Scanner;

public class _02_MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String [] rooms = input.split("\\|");
        int initialHealth= 100;
        int bitcoin=0;
        for (int i = 0; i < rooms.length; i++) {
            String currentRoom = rooms[i];
            String [] currentRoomArr= currentRoom.split(" ");
            String command= currentRoomArr[0];
            int number = Integer.parseInt(currentRoomArr[1]);
            switch (command){
                case "potion":
                    if(initialHealth+number<=100){
                    initialHealth+=number;
                        System.out.printf("You healed for %d hp.%n", number);
                        System.out.printf("Current health: %d hp.%n", initialHealth);
                    }
                    if(initialHealth+number>100){
                        int x= 100-initialHealth;
                        initialHealth=100;
                        System.out.printf("You healed for %d hp.%n",x );
                        System.out.printf("Current health: %d hp.%n", initialHealth);
                    }
                    break;
                case "chest":
                    System.out.printf("You found %d bitcoins.%n", number);
                    bitcoin+=number;
                    break;
                default:
                    if(initialHealth>number){
                        initialHealth-=number;
                    System.out.printf("You slayed %s.%n", command);
                    }
                    else {
                        System.out.printf("You died! Killed by %s.%n", command);
                        System.out.printf("Best room: %d%n", i+1);
                        initialHealth=0;
                        break;
                    }
                    break;
            }
            if (initialHealth==0){
                break;
            }
        }
        if (initialHealth>0){
        System.out.println("You've made it!");
        System.out.println("Bitcoins: "+ bitcoin);
        System.out.println("Health: " + initialHealth);
    }
    }
}
