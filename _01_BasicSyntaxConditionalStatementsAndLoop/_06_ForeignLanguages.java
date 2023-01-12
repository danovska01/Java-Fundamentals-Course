package _01_BasicSyntaxConditionalStatementsAndLoop;

import java.util.Scanner;

public class _06_ForeignLanguages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country= scanner.nextLine();
        String language = "";
        boolean unknown= false;

        switch (country){
            case "England":
            case "USA":
                language="English";
                break;
            case "Spain":
            case "Argentina":
            case "Mexico":
                language="Spanish";
                break;
            default:
                language="unknown";
                unknown=true;
                break;

        }
        if (unknown){
            System.out.println("unknown");
        }
        else {
        System.out.printf("%s", language);


    }
    }
}
