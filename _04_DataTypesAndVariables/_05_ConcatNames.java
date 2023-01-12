package _04_DataTypesAndVariables;

import java.util.Scanner;

public class _05_ConcatNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read two names and a delimiter. Print the names joined by the delimiter.

        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();
        String delimeter = scanner.nextLine();

        System.out.printf("%s%s%s", name1, delimeter, name2);
    }
}
