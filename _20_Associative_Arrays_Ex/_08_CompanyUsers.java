package _20_Associative_Arrays_Ex;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _08_CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //You will receive company name and employee's id, until you receive the command "End".
        // Add each employee to the given company. Keep in mind that a company cannot have two employees with the same id.
        Map<String, List<String>> register = new TreeMap<>();

        String input = scanner.nextLine();
        while (!input.equals("End")){
            String [] command = input.split(" -> ");
            String companyName= command[0];
            String id= command[1];
            if(!register.containsKey(companyName)){
                register.put(companyName, new ArrayList<>());
                register.get(companyName).add(id);
            }
            else {
                if(!register.values().equals(id)){
                    register.get(companyName).add(id);
                }
                else {
                    continue;
                }
            }



            input=scanner.nextLine();
        }
        //When you finish reading data, order the companies by the name in ascending order.

        //REVERSED!
        /*Map<String, List<String>> reverseSortedMap = new TreeMap<String, List<String>>(Collections.reverseOrder());
        reverseSortedMap.putAll(register);*/
        // register.entrySet()=>reverseSortedMap.entrySet()....

        for (var entry : register.entrySet()) {
            System.out.println(entry.getKey());
            for (String ids : entry.getValue()) {
                System.out.println("-- "+ ids);
            }}




    }
}
