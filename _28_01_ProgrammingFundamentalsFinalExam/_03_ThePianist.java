package _28_01_ProgrammingFundamentalsFinalExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _03_ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String,String> piecesComposers = new LinkedHashMap<>();
        Map<String,String> piecesWithTheirKeys = new LinkedHashMap<>();


        for (int i = 0; i <n; i++) {
            String [] input = scanner.nextLine().split("\\|");
            //"{piece}|{composer}|{key}".
            String piece = input[0];
            String composer = input[1];
            String key = input[2];
            piecesComposers.putIfAbsent(piece, composer);
            piecesWithTheirKeys.putIfAbsent(piece, key);

        }

        String command = scanner.nextLine();
        while (!command.equals("Stop")){
        String [] commandTokens = command.split("\\|");
        String operation = commandTokens[0];
        String piece = commandTokens[1];
        switch (operation){
            case "Add":
                //"Add|{piece}|{composer}|{key}":
                String composer = commandTokens[2];
                String key = commandTokens[3];
                if(piecesComposers.containsKey(piece)){
                    System.out.printf("%s is already in the collection!%n", piece);
                   break;
                }
                piecesComposers.putIfAbsent(piece,composer);
                piecesWithTheirKeys.putIfAbsent(piece, key);
                System.out.printf("%s by %s in %s added to the collection!%n", piece, composer, key);
            break;
            case "Remove":
                if(piecesComposers.containsKey(piece)){
                    System.out.printf("Successfully removed %s!%n", piece);
                    piecesComposers.remove(piece);
                    piecesWithTheirKeys.remove(piece);
                }
                else {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                }
                break;
            case "ChangeKey":
                String newKey = commandTokens[2];
                if(piecesComposers.containsKey(piece)){
                    System.out.printf("Changed the key of %s to %s!%n", piece, newKey);
                    piecesWithTheirKeys.put(piece, newKey);

            }
                else {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                }
                break;

        }


            command=scanner.nextLine();
        }
        for (Map.Entry<String, String> entry:piecesComposers.entrySet()) {

            System.out.printf("%s -> Composer: %s, Key: %s%n", entry.getKey(), entry.getValue(), piecesWithTheirKeys.get(entry.getKey()));
        }
    }
}
