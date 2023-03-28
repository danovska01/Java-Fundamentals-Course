package _28_04_ProgrammingFundamentalsFinalExam;

import java.util.*;

public class _03_HeroesOfCodeAndLogicVII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> HP = new LinkedHashMap<>();
        Map<String, Integer> MP = new LinkedHashMap<>();
        List<String> names= new LinkedList<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String heroName = input[0];
            int currentHP = Integer.parseInt(input[1]);
            int currentMP = Integer.parseInt(input[2]);
            HP.putIfAbsent(heroName, currentHP);
            MP.putIfAbsent(heroName, currentMP);

        }
        System.out.println();
        String [] command = scanner.nextLine().split(" - ");
        while (!command[0].equals("End")){
            String currentHeroName = command[1];
            switch (command[0]){
                case "CastSpell":
                    //"CastSpell – {hero name} – {MP needed} – {spell name}"
                    int mpNeeded = Integer.parseInt(command[2]);
                    String spellName = command[3];
                    if(mpNeeded>MP.get(currentHeroName)){
                        System.out.println(currentHeroName+ " does not have enough MP to cast "+ spellName + "!");
                    }
                    else {
                        MP.put(currentHeroName, MP.get(currentHeroName)-mpNeeded);
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n", currentHeroName, spellName, MP.get(currentHeroName));
                    }
                    break;
                case "TakeDamage":
                    //TakeDamage – {hero name} – {damage} – {attacker}
                    int damage = Integer.parseInt(command[2]);
                    String attacker = command[3];

                    if(HP.get(currentHeroName)-damage>0){
                        HP.put(currentHeroName, HP.get(currentHeroName)-damage);
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", currentHeroName, damage, attacker, HP.get(currentHeroName));
                    }
                    else {
                        System.out.printf("%s has been killed by %s!%n", currentHeroName, attacker);
                        MP.remove(currentHeroName);
                        HP.remove(currentHeroName);
                    }
                    break;
                case "Recharge":
                    //Recharge – {hero name} – {amount}
                    int amountMP = Integer.parseInt(command[2]);
                    int amountMpBeforeRecharge=MP.get(currentHeroName);
                    MP.put(currentHeroName, amountMpBeforeRecharge+amountMP);
                    if(MP.get(currentHeroName)>200){
                        System.out.printf("%s recharged for %d MP!%n", currentHeroName, 200-amountMpBeforeRecharge);
                        MP.put(currentHeroName, 200);

                    }
                    else {
                    System.out.printf("%s recharged for %d MP!%n", currentHeroName, amountMP);
                    }
                    break;
                case "Heal":
                    //Heal – {hero name} – {amount}
                    int amountHP= Integer.parseInt(command[2]);
                    int amountHpBeforeHeal=HP.get(currentHeroName);
                    HP.put(currentHeroName, amountHpBeforeHeal+amountHP);
                    if(HP.get(currentHeroName)>100){
                        System.out.printf("%s healed for %d HP!%n", currentHeroName, 100-amountHpBeforeHeal);
                        HP.put(currentHeroName, 100);
                    }
                    else {
                        System.out.printf("%s healed for %d HP!%n", currentHeroName, amountHP);
                    }



                    break;





            }

             command= scanner.nextLine().split(" - ");
        }
        /*for (Map.Entry<String, Integer> entry:HP.entrySet()) {
            names.add(String.format("%s%n  HP: %d%n  MP: %d%n", entry.getKey(), entry.getValue(), MP.get(entry.getKey())));

        }
        for (String name: names){
            System.out.println(name);
        }*/
        HP.entrySet().stream()
               .forEach(entry -> System.out.println(String.format("%s%n  HP: %d%n  MP: %d", entry.getKey(), entry.getValue(), MP.get(entry.getKey() ))));

    }
}
