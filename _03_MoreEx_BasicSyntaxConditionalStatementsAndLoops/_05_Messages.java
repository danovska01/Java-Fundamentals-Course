package _03_MoreEx_BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class _05_Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int count = Integer.parseInt(scanner.nextLine());
        String text = "";
        int result =0;


        for (int currentNum=1; currentNum<=count; currentNum++){

            int input = Integer.parseInt(scanner.nextLine());
            int mainDigit  = input%10;
            int offset = (mainDigit-2)*3;
            if (mainDigit==8 || mainDigit==9){
                offset+=1;
            }

            String digitLengthText=""+ input;
            String digitLenghtConvert= String.valueOf(digitLengthText.length());
            int digitLength = Integer.parseInt(digitLenghtConvert);


            // Finally, find the letter index (a -> 0, c -> 2, etc.). To do that, we can use the following formula:
            // (offset + digit length - 1)

            int letterIndex= offset+digitLength-1;
             result = 97+letterIndex;
             if (result ==91){
                 result=32;
             }
             offset=0;
             char symbol = (char) result;
            //char symbol = Character.forDigit(letterIndex, 10);


            text+=symbol;


        }
        System.out.printf("%s", text);
    }
}
