package _02_ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class _11_RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int trashedHeadset= lostGamesCount/2;
        int trashedMouse= lostGamesCount/3;
        int trashedKeyboard= lostGamesCount/6;
        int trashedDisplay= lostGamesCount/12;

        double totalExpenses = headsetPrice*trashedHeadset+ (mousePrice*trashedMouse)+ (keyboardPrice*trashedKeyboard)+ (displayPrice*trashedDisplay);

        System.out.printf("Rage expenses: %.2f lv.", totalExpenses);


    }
}
