package _06_MoreEx_DataTypesAndVariables;

import java.util.Scanner;

public class _05_DecryptingMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int lines = Integer.parseInt(scanner.nextLine());
        String text="";

        for (int currentLine=1; currentLine<=lines; currentLine++){
            char symbol = scanner.nextLine().charAt(0);
            char newSymbol= (char) (symbol+key);
            text+=newSymbol;

        }
        System.out.println(text);
    }
}
