package _21_Associative_Arrays_More_Ex;

import java.util.*;

public class _01_Ranking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //You will receive some lines of input in the format "{contest}:{password for contest}" until you receive "end of contests".
        String input1 = scanner.nextLine();
        Map<String, String> contests = new LinkedHashMap<>();
        while (!input1.equals("end of contests")) {

            String[] command1 = input1.split(":");
            String contest = command1[0];
            String password = command1[1];

            if (!contests.containsKey(contest)) {
                contests.put(contest, password);

            } else {
                continue;
            }

            input1 = scanner.nextLine();
        }
        //After that you will receive other type of inputs in format "{contest}=>{password}=>{username}=>{points}"
        // until you receive "end of submissions". Here is what you need to do:

        String input2 = scanner.nextLine();
        Map<String, Map<String, Integer>> users = new TreeMap<>();

        while (!input2.equals("end of submissions")) {

            String[] command2 = input2.split("=>");
            String currentContest = command2[0];
            String currentPassword = command2[1];
            String userName = command2[2];
            int points = Integer.parseInt(command2[3]);

            //    • Check if the contest is valid (if you received it in the first type of input)
            //    • Check if the password is correct for the given contest
            //Save the user with the contest they take part in (a user can take part in many contests) and the points the user has in the given contest.

            if (contests.containsKey(currentContest)) {
                String checkPassword = contests.get(currentContest);

                if (checkPassword.equals(currentPassword)) {
                    Map<String, Integer> course = new LinkedHashMap<>();

                    if (! users.containsKey(userName)) {
                        course.put(currentContest, points);
                        users.put(userName, course);
                    } else {
                        course = users.get(userName);

                        if (course.containsKey(currentContest)) {
                            //If you receive the same contest and the same user, update the points only if the new ones are more than the older ones.
                            int currentPoints = course.get(currentContest);

                           if(currentPoints<points){
                               course.put(currentContest, points);
                               users.put(userName, course);
                           }

                        } else {
                            users.get(userName).put(currentContest, points);
                        }

                    }
                }

            } else {
                input2 = scanner.nextLine();
                continue;
            }

            input2 = scanner.nextLine();
        }
        //At the end you have to print the info for the user with the most points in the format "Best candidate is {user} with total {total points} points.".
        // After that print all students ordered by their names. For each user print each contest with the points in descending order. See the examples.

        int totalSum = 0;
        for (Map.Entry<String, Map<String, Integer>> user : users.entrySet()) {
            int sum = user.getValue().values().stream().mapToInt(i -> i).sum();
            if (sum > totalSum) {
                totalSum = sum;
            }
        }
        for (Map.Entry<String, Map<String, Integer>> user : users.entrySet()) {
            if (user.getValue().values().stream().mapToInt(i -> i).sum() == totalSum) {
                System.out.printf("Best candidate is %s with total %d points.%n", user.getKey(), totalSum);
            }
        }
        System.out.println("Ranking:");
        users.forEach((key, value) -> {
            System.out.printf("%s%n", key);
            value.entrySet().stream().
                    sorted((f, s) -> s.getValue() - f.getValue()).
                    forEach(i -> System.out.printf("#  %s -> %d%n", i.getKey(), i.getValue()));
        });
    }
}
