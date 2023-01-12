package _02_ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class _01_Ages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int age = Integer.parseInt(scanner.nextLine());
        String person= "";

        if (0<=age&&age<=2){
            person="baby";
        }
        if (3<=age&&age<=13){
            person="child";
        }
        if (14<=age&&age<=19){
            person="teenager";
        }
        if (20<=age&&age<=65){
            person="adult";
        }
        if (age>=66){
            person="elder";
        }
        System.out.println(person);




    }
}
