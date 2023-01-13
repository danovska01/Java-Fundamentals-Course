package _06_MoreEx_DataTypesAndVariables;

import java.util.Scanner;

public class _06_BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int openingBracket = 0;
        int closingBracket = 0;
        if (n >= 1 && n <= 20) {
            for (int i = 1; i <= n; i++) {
                String text = scanner.nextLine();
                char symbol = text.charAt(0);

                if (symbol == '(') {
                    openingBracket++;
                }
                if (symbol == ')') {
                    closingBracket++;
                    if (openingBracket - closingBracket != 0) {
                        System.out.println("UNBALANCED");
                        return;
                    }
                }
            }
        }
        if (openingBracket == closingBracket) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }
    }
}



