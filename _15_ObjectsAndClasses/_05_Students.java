package _15_ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class _05_Students {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String command = scanner.nextLine();
        List<Student> studentList= new ArrayList<>();

        while (!command.equals("end")){
            String [] parameters = command.split(" ");
            String firstName = parameters[0];
            String secondName = parameters[1];
            String age = parameters[2];
            String homeTown= parameters[3];

            Student student= new Student(firstName,secondName,age,homeTown);
            studentList.add(student);

            command= scanner.nextLine();
        }

        String cityName = scanner.nextLine();

            for (Student student: studentList) {
                if(student.getHomeTown().equals(cityName)){
                   String result = String.format("%s %s is %s years old", student.getFirstName(), student.getSecondName(),student.getAge());
                    System.out.println(result);

                }
            }



    }

    private static int indexOfStudent(List<Object> studentList, String firstName, String secondName) {
        for (int i = 0; i <studentList.size() ; i++) {
            Student s = (Student) studentList.get(i);
            if((s.getFirstName().equals(firstName))
                && (s.getSecondName().equals(secondName))){
                return i;
            }

        }
        return -1;

    }

    public static class Student {
       private String firstName;
        private String secondName;
        private String age;
        private String homeTown;



        public String getFirstName() {
            return this.firstName;
        }
       public String getSecondName() {
            return this.secondName;
        }

        public String getAge() {
            return this.age;
        }

        public String getHomeTown() {
            return this.homeTown;
        }




        Student(String firstName, String secondName, String age, String homeTown) {
            this.firstName=firstName;
            this.secondName= secondName;
            this.age= age;
            this.homeTown= homeTown;
        }




    }

}
