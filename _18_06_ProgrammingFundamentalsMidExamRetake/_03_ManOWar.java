package _18_06_ProgrammingFundamentalsMidExamRetake;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.util.Objects.checkIndex;

public class _03_ManOWar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> statusPiratesShip = Arrays.stream(scanner.nextLine().split("\\>")).collect(Collectors.toList());
        List<String> statusWarship = Arrays.stream(scanner.nextLine().split("\\>")).collect(Collectors.toList());
        int maximumHealthCapacity = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();


        boolean printStatus=true;
        boolean scanCommand=true;



        while (!command.equals("Retire")) {

            String[] items = command.split(" ");
            String currentCommand = items[0];


            switch (currentCommand) {

                case "Fire":
                    //the pirate ship attacks the warship with the given damage at that section.
                    int index = Integer.parseInt(items[1]);
                    int damage = Integer.parseInt(items[2]);
                    boolean isFireIndexValid = checkIndex(index, statusWarship);

                    if (isFireIndexValid) {
                        int sectionHealth = Integer.parseInt(statusWarship.get(index));
                        sectionHealth -= damage;
                        if (sectionHealth > 0) {
                            statusWarship.set(index, String.valueOf(sectionHealth));
                        } else {
                            System.out.println("You won! The enemy ship has sunken.");
                            scanCommand=false;
                            printStatus=false;
                            break;
                        }
                    }


                    break;
                case "Defend":
                    //Defend {startIndex} {endIndex} {damage}" - the warship attacks the pirate ship with the given damage at that range (indexes are inclusive).
                    index = Integer.parseInt(items[1]);
                    int endIndex = Integer.parseInt(items[2]);
                    damage = Integer.parseInt(items[3]);
                    boolean isDefendIndex1Valid = checkIndex(index, statusPiratesShip);
                    boolean isDefendIndex2Valid = checkIndex(endIndex, statusPiratesShip);

                    if (isDefendIndex1Valid && isDefendIndex2Valid) {
                        for (int i = index; i <= endIndex; i++) {
                            int sectionHealth = Integer.parseInt(statusPiratesShip.get(i));
                            sectionHealth -= damage;
                            if (sectionHealth > 0) {
                                statusPiratesShip.set(i, String.valueOf(sectionHealth));
                            } else {
                                System.out.println("You lost! The pirate ship has sunken.");
                                printStatus=false;
                                scanCommand=false;
                                break;
                            }

                        }


                    }


                    break;
                case "Repair":
                    //Repair {index} {health}" - the crew repairs a section of the pirate ship with the given health.
                    index = Integer.parseInt(items[1]);
                    int health = Integer.parseInt(items[2]);
                    boolean isRepairIndexValid = checkIndex(index, statusPiratesShip);
                    if(isRepairIndexValid){
                        int sectionHealth = Integer.parseInt(statusPiratesShip.get(index));
                        sectionHealth += health;
                        if (sectionHealth >= maximumHealthCapacity) {
                            statusPiratesShip.set(index, String.valueOf(maximumHealthCapacity));
                        } else {
                            statusPiratesShip.set(index, String.valueOf(sectionHealth));

                        }
                    }
                    break;
                case "Status":
                    //prints the count of all sections of the pirate ship that need repair soon, which are all sections that are lower than 20% of the maximum health capacity.
                    int countSectionsForRepair=0;
                    for (int i = 0; i < statusPiratesShip.size(); i++) {
                        double currentSection= Double.parseDouble(statusPiratesShip.get(i));
                        if(currentSection<(0.2*maximumHealthCapacity)){
                          countSectionsForRepair++;
                        }
                    }
                    System.out.println(countSectionsForRepair + " sections need repair.");
                    break;

            }

            if (scanCommand){

                command = scanner.nextLine();
            }
            else {
                break;
            }





        }

         if (printStatus){
            int statusOfWarship= count(statusWarship);
            int statusOfPirate= count(statusPiratesShip);
        System.out.println("Pirate ship status: "+ statusOfPirate);
        System.out.println("Warship status: "+ statusOfWarship);
         }


    }


    private static int count(List<String> statusWarship) {
        int sum= 0;
        for (int i = 0; i < statusWarship.size(); i++) {
            int value= Integer.parseInt(statusWarship.get(i));
            sum+=value;
        }
        return sum;
    }

    private static boolean checkIndex(int index, List<String> statusWarship) {
        if (index < 0 || index > statusWarship.size()) {

            return false;
        }

        return true;
    }
}
