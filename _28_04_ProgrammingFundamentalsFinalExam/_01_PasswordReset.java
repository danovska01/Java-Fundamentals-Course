package _28_04_ProgrammingFundamentalsFinalExam;

import java.util.Scanner;

public class _01_PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        String [] command = scanner.nextLine().split(" ");
        System.out.println();
        while (!command[0].equals("Done")){

            switch (command[0]){
                case "TakeOdd":
                    //Takes only the characters at odd indices and concatenates them to obtain the new raw password and then prints it.
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < password.length(); i++) {
                        if(i%2!=0){
                            char currentSymbol = password.charAt(i);
                            sb.append(currentSymbol);
                        }
                    }
                    password=sb.toString();
                    System.out.println(password);
                    break;
                case "Cut":
                    int start= Integer.parseInt(command[1]);
                    int length = Integer.parseInt(command[2]);
                    int end = start+length;
                    //Gets the substring with the given length starting from the given index from the password
                    // and removes its first occurrence, then prints the password on the console.
                    password = new StringBuilder(password)
                            .delete(start, end).toString();
                    System.out.println(password);
                    //                        int index = Integer.parseInt(command[1]);
                    //                        int length = Integer.parseInt(command[2]);
                    //                        String stringToRemove= password.substring(index, index+length);
                    //                        password= password.replace(stringToRemove, "");
                    //                        System.out.println(password);
                    //
                    //       По условие командата Cut трябва да изтрие конкретна част от текста, докато решението ще изтрие всички съвпадения.
                    //       Например при парола AtestBtest и команда Cut 6 4 трябва да получим AtestB, но програмата ще върне AB

                    break;
                case "Substitute":
                    String substring = command[1];
                    String substitute = command[2];
                    //        ◦ if the raw password contains the given substring, replaces all of its occurrences with the substitute text given and prints the result.
                    if(password.contains(substring)){
                       while (password.contains(substring)){
                           password=password.replace(substring, substitute);
                       }
                        System.out.println(password);
                    }
                    //        ◦ If it doesn't, prints "Nothing to replace!".
                    else {
                        System.out.println("Nothing to replace!");
                    }
                    break;
                default:
                    break;

            }


            command= scanner.nextLine().split(" ");

        }

            System.out.println("Your password is: "+ password);



    }
}
