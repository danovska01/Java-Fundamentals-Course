package _02_ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class _05_Login {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        String username= scanner.nextLine();
        String password= "";
        // You will be given a string representing a username. The password will be that username reversed.
        int counterTries=0;
        boolean isBlocked=false;

        for (int position=username.length()-1; position>=0; position--){
            char currentSymbol= username.charAt(position);
            password+=currentSymbol;
        }

        //Until you receive the correct password print on the console "Incorrect password. Try again.".
        String input = scanner.nextLine();
        while(!input.equals(password)) {
            counterTries++;
            if (counterTries==4){
                isBlocked=true;
                break;
            }
            System.out.println("Incorrect password. Try again.");

            input= scanner.nextLine();
        }

        //When you receive the correct password print "User {username} logged in."
        if (input.equals(password)){
        System.out.printf("User %s logged in.", username);
        }

        //on the fourth try if the password is still not correct print "User {username} blocked!" and end the program.
        if (isBlocked){
            System.out.printf("User %s blocked!", username);
        }







           
        }

    }

