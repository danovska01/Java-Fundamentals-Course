package _20_Associative_Arrays_Ex;

import java.util.*;

import static java.lang.System.in;

public class _06_StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        //On the first line you will receive number n. After that you will receive n pair of rows. First you will receive the student's name,
        // after that you will receive his grade. Check if student already exists, and if not - add him. Keep track of all grades for each student.
        Map<String, List<Double>> register = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <=n ; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());
            if(!register.containsKey(name)){
                register.put(name,new ArrayList<>() );
                register.get(name).add(grade);
            }
            else {
                register.get(name).add(grade);
            }

        }
        //When you finish reading data, keep students with average grade higher or equal to 4.50.
        // Order filtered students by average grade in descending order.

        double average;
        Map<String, Double> averageGrades = new LinkedHashMap<>();

        for (Map.Entry<String, List<Double>> entry : register.entrySet()) {
            average = 0;
            for (int i = 0; i < entry.getValue().size(); i++) {
                average = average + entry.getValue().get(i);
            }
            average = average / entry.getValue().size();
            if (average >= 4.5) {
                averageGrades.put(entry.getKey(), average);
            }
        }
        //.sorted((d1, d2) -> d2.getValue().compareTo(d1.getValue()))
        //.sorted((d1, d2)  -> Comparator.<Double>reverseOrder().compare(d1.getValue(), d2.getValue()))
        //.sorted(Comparator.comparingDouble(kvp -> -kvp.getValue()))
        //.sorted(Entry.comparingByValue(Comparator.reverseOrder()))

        averageGrades.entrySet().stream().sorted((d1, d2) -> Double.compare(d2.getValue(), d1.getValue())).forEach(name -> {
            System.out.print(name.getKey() + " -> ");
            System.out.printf("%.2f %n", name.getValue());
        });


    }
}
