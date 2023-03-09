package _24_Text_Processing_More_Ex;

import java.util.Arrays;
import java.util.Scanner;

public class _03_TreasureFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] key = Arrays.stream(scanner.nextLine()
                        .trim()
                        .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String input = scanner.nextLine();
        StringBuilder decryptedSb = new StringBuilder();
        boolean stop = false;
        while (!input.equals("find")){
            for (int i = 0; i < input.length(); i++) {

                for (int j = 0; j < key.length; j++) {
                    if(i==input.length()){
                        stop= true;
                        break;
                    }
                    char currentSymbol= input.charAt(i);
                    int number = Integer.parseInt(String.valueOf(key[j]));
                    int changeSymbol= currentSymbol-number;
                    char symbolToAdd= (char)changeSymbol;
                    decryptedSb.append(symbolToAdd);

                    i++;

                }
                if(stop){
                    break;
                }
                i--;



            }
            int indexOfTypeStart = decryptedSb.indexOf("&");
            int indexOfTypeEnd = decryptedSb.indexOf("&",indexOfTypeStart+1);
            String type = decryptedSb.substring(indexOfTypeStart+1, indexOfTypeEnd );
            int indexOfCoordinatesStart = decryptedSb.indexOf("<");
            int indexOfCoordinatesEnd = decryptedSb.indexOf(">");
            String coordinates = decryptedSb.substring(indexOfCoordinatesStart + 1, indexOfCoordinatesEnd);
            System.out.printf("Found %s at %s%n", type, coordinates);
            decryptedSb.setLength(0);


            input= scanner.nextLine();
            stop = false;
        }

    }
}
