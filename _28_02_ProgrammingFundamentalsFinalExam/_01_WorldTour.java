package _28_02_ProgrammingFundamentalsFinalExam;

import java.util.*;

public class _01_WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stops = scanner.nextLine();
        StringBuilder sb= new StringBuilder(stops);


        String manipulationCommand = scanner.nextLine();
        System.out.println();
        while (!manipulationCommand.equals("Travel")){
            String [] manipulations = manipulationCommand.trim().split(":");
            String currentCommand= manipulations[0];

            switch (currentCommand){

                case "Add Stop":
                    //    • Add Stop:{index}:{string}":
                    //     Insert the given string at that index only if the index is valid
                    int index= Integer.parseInt(manipulations[1]);
                    String stringToAdd= manipulations[2];


                    if(index<stops.length()&& index>=0){
                        sb.insert(index, stringToAdd);
                    /*sb.append(stops.substring(0, index));
                    String secondPart= stops.substring(index, stops.length());
                    sb.append(stringToAdd);
                    sb.append(secondPart);*/
                        stops= sb.toString();
                    }

                    System.out.println(stops);


                    break;
                case "Remove Stop":
                    //    • "Remove Stop:{start_index}:{end_index}":
                    //    ◦ Remove the elements of the string from the starting index to the end index (inclusive) if both indices are valid
                    int startIndex= Integer.parseInt(manipulations[1]);
                    int endIndex= Integer.parseInt(manipulations[2]);
                    if(startIndex>=0 && endIndex<stops.length()){
                        sb.replace(startIndex, endIndex+1, "");
                        stops= sb.toString();
                    }

                    System.out.println(stops);
                    break;
                case "Switch":
                    //    • "Switch:{old_string}:{new_string}":
                    //    ◦ If the old string is in the initial string, replace it with the new one (all occurrences)
                    String oldString= manipulations[1];
                    String newString= manipulations[2];

                    while (stops.contains(oldString)){
                        int startIndexOldString= sb.indexOf(oldString);
                        int endIndexOldString= startIndexOldString+oldString.length()-1;
                        sb.replace(startIndexOldString,endIndexOldString+1, newString);
                        stops=sb.toString();

                    }
                    System.out.println(stops);

                    break;

            }

            manipulationCommand= scanner.nextLine();
        }
        System.out.println("Ready for world tour! Planned stops: " + stops);
    }
}
