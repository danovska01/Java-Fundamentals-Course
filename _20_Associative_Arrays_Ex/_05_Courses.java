package _20_Associative_Arrays_Ex;

import java.util.*;
import java.util.stream.Stream;

public class _05_Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Write a program, which keeps information about courses. Each course has a name and registered students.
        //You will receive course name and student name, until you receive the command "end".
        String input = scanner.nextLine();
        Map<String, List<String>> register = new LinkedHashMap<>();
        while (!input.equals("end")){
            String [] command = input.split(" : ");
            String courseName= command[0];
            String studentName= command[1];


            if(!register.containsKey(courseName)){
                register.put(courseName, new ArrayList<>());
                register.get(courseName).add(studentName);

            }
            else {
                register.get(courseName).add(studentName);
            }

            input=scanner.nextLine();

        }

        //When you do receive the command "end", print the courses with their names and total registered users, ordered by the count of registered users in descending order.
        // For each contest print registered users ordered by name in ascending order.

        register.entrySet().stream().sorted((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()))
                .forEach(e -> {
                    System.out.println(String.format("%s: %d", e.getKey(), e.getValue().size()));
                    e.getValue().stream().sorted(String::compareTo).forEach(p -> System.out.println(String.format("-- %s",p)));
                });

    }
}
