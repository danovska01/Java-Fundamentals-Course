package _28_01_ProgrammingFundamentalsFinalExam;

import java.util.Scanner;

public class _01_TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder encryptedMessage = new StringBuilder(scanner.nextLine());
        String input = scanner.nextLine();
        while (!input.equals("Decode")){
            String [] instructions = input.split("\\|");
            String command = instructions[0];

            switch (command){
                case "Move":
                    //Moves the first n letters to the back of the string
                    int number = Integer.parseInt(instructions[1]);
                    for (int i = 0; i<number; i++) {

                        encryptedMessage.append(encryptedMessage.charAt(0));
                        encryptedMessage.deleteCharAt(0);
                    }
                    break;
                case "Insert":
                    //    • Insert {index} {value}":
                    //    ◦ Inserts the given value before the given index in the string
                    int index = Integer.parseInt(instructions[1]);
                    String value = instructions[2];
                    encryptedMessage.insert(index, value);
                    break;
                case "ChangeAll":
                    //    • ChangeAll {substring} {replacement}":
                    //     Changes all occurrences of the given substring with the replacement text
                    String substring = instructions[1];
                    String replacement = instructions[2];
                    String encryptedMessageText= encryptedMessage.toString();
                       while (encryptedMessageText.contains(substring)){
                        int indexStart = encryptedMessageText.indexOf(substring);
                        int indexEnd = indexStart + substring.length();
                        encryptedMessage.replace(indexStart, indexEnd, replacement);
                        encryptedMessageText=encryptedMessage.toString();
                       }





                    break;

            }

            input= scanner.nextLine();

        }
        System.out.printf("The decrypted message is: %s%n", encryptedMessage);
    }
}
