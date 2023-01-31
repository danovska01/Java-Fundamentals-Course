package _16_ObjectsAndClasses_Ex;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class _07_OrderByAge {
    static class Person {
        String name;
        String ID;

        int age;
        public int getAge() {
            return age;
        }


        public Person(String name, String ID, int age) {
            this.name = name;
            this.ID= ID;
            this.age= age;
        }
        @Override
        public String toString() {
            String toStringReturn = String.format("%s with ID: %s is %d years old.", this.name, this.ID, this.age);
            return toStringReturn;
        }
    }
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String input= scanner.nextLine();

        List<Person> listOfPersons = new ArrayList<>();

        while(!input.equals("End")){
            // When you receive the command "End", stop taking input and print all the people, ordered by age.


            String [] tokens = input.split(" ");
            String name = tokens[0];
            String ID = tokens[1];
            int age = Integer.parseInt(tokens[2]);
            Person currentPerson= new Person(name, ID, age);
            listOfPersons.add(currentPerson);
            input= scanner.nextLine();

        }
        listOfPersons.sort(Comparator.comparing(Person::getAge));
        for(Person a : listOfPersons){
            System.out.println(a);
        }

    }
}
