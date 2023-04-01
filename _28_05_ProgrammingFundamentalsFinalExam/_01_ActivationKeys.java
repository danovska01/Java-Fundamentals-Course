package _28_05_ProgrammingFundamentalsFinalExam;

import java.util.Scanner;

public class _01_ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rawKey = scanner.nextLine();
        String []command= scanner.nextLine().split("\\>\\>\\>");
        while (!command[0].equals("Generate")){

            switch (command[0]){
                case "Contains":
                    String substring = command[1];
                    if(rawKey.contains(substring)){
                        System.out.println(rawKey+ " contains "+ substring);
                    }
                    else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    //"Flip>>>Upper/Lower>>>{startIndex}>>>{endIndex}":
                    String upperOrLower = command[1];
                    int startIndex = Integer.parseInt(command[2]);
                    int endIndex = Integer.parseInt(command[3]);
                    String oldString= rawKey.substring(startIndex,endIndex); //the end index is exclusive
                    String stringToFlip = oldString;
                    if(upperOrLower.equals("Upper")){
                        stringToFlip=stringToFlip.toUpperCase();
                    }
                    if(upperOrLower.equals("Lower")){
                        stringToFlip=stringToFlip.toLowerCase();
                    }
                    rawKey= rawKey.replace(oldString, stringToFlip);
                    System.out.println(rawKey);
                    break;
                case "Slice":
                    //Slice>>>{startIndex}>>>{endIndex}"
                    //the end index is exclusive
                  startIndex = Integer.parseInt(command[1]);
                  endIndex = Integer.parseInt(command[2]);
                  String stringToDelete= rawKey.substring(startIndex, endIndex);
                  rawKey=rawKey.replace(stringToDelete, "");
                    System.out.println(rawKey);

                    break;


            }

            command=scanner.nextLine().split("\\>\\>\\>");
        }
        System.out.println("Your activation key is: "+rawKey);

    }
}
