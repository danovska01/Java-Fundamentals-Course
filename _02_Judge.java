package _21_Associative_Arrays_More_Ex;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

public class _02_Judge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // {username} -> {contest} -> {points}
        String input = scanner.nextLine();


        LinkedHashMap<String, LinkedHashMap<String, Integer>> contests = new LinkedHashMap<>();

        while (!input.equals("no more time")){
            String [] tokens = input.split(" -> ");
            String userName = tokens[0];
            String contest = tokens[1];
            int points = Integer.parseInt(tokens[2]);

            LinkedHashMap<String, Integer> users = new LinkedHashMap<>();
            users.put(userName, points);

            contests.putIfAbsent(contest, new LinkedHashMap<>());
            contests.get(contest).putIfAbsent(userName, -1);
            if (contests.get(contest).get(userName) < points) {
                contests.get(contest).put(userName, points);
            }


            input= scanner.nextLine();
        }
        //At that point you should print each contest in order of input, for each contest print the participants ordered by points in desecending order,
        // than ordered by name in ascending order. After that, you should print individual statistics for every participant ordered by total points in desecnding order,
        // and then by alphabetical order.
        AtomicInteger num = new AtomicInteger(1);

        contests.entrySet().stream().forEach(e -> {
            num.set(1);
            System.out.println(e.getKey() + ": " + e.getValue().size() + " participants");
            e.getValue().entrySet().stream().sorted((k2, k1) -> {
                int sort = Integer.compare(k1.getValue(), k2.getValue());
                if (sort == 0) {
                    sort = k2.getKey().compareTo(k1.getKey());

                }
                return sort;
            }).forEach(element -> {
                System.out.printf("%d. %s <::> %d\n", num.getAndIncrement(), element.getKey(), element.getValue());
            });
        });
        Map<String, Integer> standings = new LinkedHashMap<>();

        for(Map.Entry<String, LinkedHashMap<String, Integer>> wtf : contests.entrySet()) {
            for (Map.Entry<String, Integer> lol : wtf.getValue().entrySet()) {
                standings.putIfAbsent(lol.getKey(), 0);
                standings.put(lol.getKey(), standings.get(lol.getKey()) + lol.getValue());
            }
        }
        System.out.println("Individual standings:");
        num.set(1);

        standings.entrySet().stream().sorted((e2, e1) -> {
            int sort = Integer.compare(e1.getValue(), e2.getValue());
            if (sort == 0) {
                sort = e2.getKey().compareTo(e1.getKey());
            }
            return sort;

        }).forEach(element -> {
            System.out.printf("%d. %s -> %d\n", num.getAndIncrement(), element.getKey(), element.getValue());
        });


    }
}
