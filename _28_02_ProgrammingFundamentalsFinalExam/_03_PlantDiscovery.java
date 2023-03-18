package _28_02_ProgrammingFundamentalsFinalExam;

import java.util.*;

public class _03_PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> plantsLogRarity= new HashMap<>();
        Map<String, List<Double>> plantsRatings= new HashMap<>();


        while (n-- > 0) {
            //{plant}<->{rarity}
       String [] input = scanner.nextLine().split("<->");
       String plant = input[0];
       int rarity = Integer.parseInt(input[1]);
       plantsLogRarity.put(plant, rarity);

       plantsRatings.putIfAbsent(plant, new ArrayList<>());

        }

        String command = scanner.nextLine();

        while (!command.equals("Exhibition")){
            String[] tokens = command.split(": ");
            String currentCommand = tokens[0];
            String[] data = tokens[1].split(" - ");
            String plant = data[0];
            if (!plantsLogRarity.containsKey(data[0])) {
                System.out.println("error");
                continue;
            }

            switch (currentCommand){
                case"Rate":
                    //Rate: {plant} - {rating}" – add the given rating to the plant (store all ratings)

                    double rating = Double.parseDouble((data[1]));
                    plantsRatings.get(plant).add(rating);
                    break;


                case"Update":
                    //"Update: {plant} - {new_rarity}" – update the rarity of the plant with the new one
                    int newRarity = Integer.parseInt(data[1]);
                    plantsLogRarity.put(plant, newRarity);
                    break;
                case"Reset":
                    //Reset: {plant}" – remove all the ratings of the given plant
                    plantsRatings.get(plant).clear();

                    break;
                default:
                    System.out.println("error");
                    break;
            }


            command= scanner.nextLine();

        }
       /* Map <String, Double> averageRatings = new LinkedHashMap<>();

        for (Map.Entry<String, List<Integer>> entry:plantsRatings.entrySet()) {
            double sum = 0;

            List<Integer> listRatings=entry.getValue();
            for (int i = 0; i < listRatings.size(); i++) {
                int currentNum= listRatings.get(i);
                sum+=currentNum;

            }
            double averageRating = sum/listRatings.size();
            averageRatings.put(entry.getKey(), averageRating);
        }

        System.out.println("Plants for the exhibition: " );


        for (Map.Entry<String, Integer> entry:plantsLogRarity.entrySet()) {
            double currentAverage = averageRatings.get(entry.getKey());
            if((averageRatings.get(entry.getKey()).isNaN())){
                currentAverage=0;
            }


            System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", entry.getKey(), entry.getValue(), currentAverage);

        }*/
        System.out.println("Plants for the exhibition:");


        plantsLogRarity.entrySet().stream()
                .forEach(entry -> System.out.println(String.format("- %s; Rarity: %d; Rating: %.2f",
                        entry.getKey(), entry.getValue(),
                        plantsRatings.get(entry.getKey()).stream()
                                .mapToDouble(Double::doubleValue)
                                .average().orElse(0.0))));




    }
}
