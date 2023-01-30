package _16_ObjectsAndClasses_Ex;

import java.util.*;
import java.util.stream.Collectors;

public class _03_OpinionPoll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Using the Person class, write a program that reads from the console N lines of personal information and
        // then prints all people whose age is more than 30 years, sorted in alphabetical order.
        //Note: you can use stream() to filter people.

        // Input:
        //3
        //Peter 12
        //Sam 31
        //Itan 48

        int numberLines = Integer.parseInt(scanner.nextLine());
        List<Person> listOfPersons= new ArrayList<>();


        for (int i = 1; i <= numberLines; i++) {
            String input = scanner.nextLine();
            Person currentPerson= new Person(input.split(" ")[0], Integer.parseInt(input.split(" ")[1]));



            if (currentPerson.getAge()>30){
                listOfPersons.add(currentPerson);


            }
        }
        listOfPersons.sort(Comparator.comparing(Person::getName));
        for(Person p : listOfPersons){
            System.out.println(p.name + " - " + p.age);
        }


    }
    static class Person {
        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }






        public Person(String name, int age) {
            this.name= name;
            this.age= age;
        }
    }
}
