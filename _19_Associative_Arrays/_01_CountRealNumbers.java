package _19_Associative_Arrays;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _01_CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Read a list of real numbers and print them in ascending order along with their number of occurrences.

        // Read an array of real numbers (double)

        //String [] input = scanner.next().split(" ");
        //double [] numbers = Arrays.stream(input).mapToDouble(Double::parseDouble).toArray();

        double[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

        //Use TreeMap<Double, Integer> named counts
        TreeMap<Double, Integer> counts = new TreeMap<>();

        //Pass through each input number num and increase counts (when num exists in the map) or add it with value 1
        for (double num : numbers) {
            if (!counts.containsKey(num)) {
                counts.put(num, 1);
            } else {
                int occurrences = counts.get(num);
                occurrences++;
                counts.put(num, occurrences);
            }}


        /*for(double num: numbers){
            if(!counts.containsKey(num)){
                counts.put(num, 0);
            }
            counts.put(num, counts.get(num)+1);
        }*/

            //Pass through all numbers num in the map and print the number and its count of occurrences after formatting it to a decimal place without trailing zeros
            // (otherwise the output will have too much decimal places, e.g. 2.500000 instead of 2.5);

            for (Map.Entry<Double, Integer> entry : counts.entrySet()) {
                DecimalFormat df = new DecimalFormat("#.#####");
                System.out.printf("%s -> %d%n", df.format(entry.getKey()), entry.getValue());
                //System.out.printf("%.0f->%d%n", entry.getKey(), entry.getValue());
            }


        }
    }
