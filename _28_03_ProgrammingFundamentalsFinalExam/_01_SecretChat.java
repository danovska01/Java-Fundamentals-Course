package _28_03_ProgrammingFundamentalsFinalExam;

import java.util.Scanner;
import java.util.regex.Pattern;

public class _01_SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        String command = scanner.nextLine();


        while (!command.equals("Reveal")){
            String [] commandTokens= command.split(":\\|:");
            String currentCommand = commandTokens[0];
            switch (currentCommand){
                case "InsertSpace":
                    //InsertSpace:|:{index}
                    int index= Integer.parseInt(commandTokens[1]);
                    message= message.substring(0, index)+ " " + message.substring(index, message.length());
                    System.out.println(message);
                    break;
                case "Reverse":
                    //Reverse:|:{substring}
                    String substring = commandTokens[1];
                    if(message.contains(substring)){
                        StringBuilder sbSubstring = new StringBuilder(substring);
                        String reverseSubstring= sbSubstring.reverse().toString();
                        message= message.replaceFirst(Pattern.quote(substring), reverseSubstring);
                        System.out.println(message);
                    }
                    else {
                    System.out.println("error");
                }
                    break;
                case "ChangeAll":
                    //ChangeAll:|:{substring}:|:{replacement}
                    String substringFoRReplace = commandTokens[1];
                    String replacement= commandTokens[2];
                    //while (message.contains(substringFoRReplace)){
                      //  message=message.replace(substringFoRReplace,replacement);
                    //}
                    message=message.replaceAll(substringFoRReplace, replacement);
                    System.out.println(message);
                    break;

            }

            command= scanner.nextLine();
        }
        System.out.println("You have a new text message: " + message);
    }
}
