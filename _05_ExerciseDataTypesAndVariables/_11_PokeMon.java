package _05_ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class _11_PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialPokePower = Integer.parseInt(scanner.nextLine());
        int distanceBetweenThePokeTargets = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());
        int pokedCount = 0;
        int pokePower = initialPokePower;


        while (pokePower >= distanceBetweenThePokeTargets) {

            if (pokePower == 0.5 * initialPokePower) {

                    if (exhaustionFactor > 0) {
                        pokePower /= exhaustionFactor;
                        if (pokePower < distanceBetweenThePokeTargets)
                        {
                            break;
                        }
                    }
            }
            pokePower -= distanceBetweenThePokeTargets;
            pokedCount++;

        }

            System.out.printf("%d%n", pokePower);
            System.out.printf("%d", pokedCount);


    }
}