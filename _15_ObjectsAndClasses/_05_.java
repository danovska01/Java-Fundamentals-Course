package _15_ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _05_ {

            static class Student{
                private String firstName;
                private String secondName;
                private String age;
                private String homeTown;

                public Student(String firstName, String secondName, String age, String homeTown) {
                    this.firstName = firstName;
                    this.secondName = secondName;
                    this.age = age;
                    this.homeTown = homeTown;
                }

                public String getFirstName() {
                    return firstName;
                }

                public String getSecondName() {
                    return secondName;
                }

                public String getAge() {
                    return age;
                }


                public String getHomeTown() {
                    return homeTown;
                }





            }

            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                String input = sc.nextLine();

                List<Student> students = new ArrayList<>();
                while(!input.equals("end")){
                    String firstName = input.split(" ")[0];
                    String secondName = input.split(" ")[1];
                    String age = input.split(" ")[2];
                    String homeTown = input.split(" ")[3];

                    /*int index= indexOfStudent (studentList, firstName, secondName);
            if (index==-1){
                studentList.add(student);
            }
            else {
                studentList.set(index, new Student(firstName, secondName, age, homeTown));
            }*/

                    if (isStudentExisting(students, firstName, secondName)){
                        Student student = getStudent(students, firstName, secondName);
                        student.firstName = firstName;
                        student.secondName = secondName;
                        student.age = age;
                        student.homeTown = homeTown;

                    }
                    else {
                        Student student = new Student(firstName, secondName, age, homeTown);
                        students.add(student);
                    }
                    input = sc.nextLine();
                }
                String city = sc.nextLine();
                for (Student student: students) {
                    if(student.getHomeTown().equals(city)){
                        String result = String.format("%s %s is %s years old", student.getFirstName(), student.getSecondName(),student.getAge());
                        System.out.println(result);

                    }


                    }
                }

    private static Student getStudent(List<Student> students, String firstName, String secondName) {
                Student existingStudent = null;
                for(Student student : students){
                    if ( student.getFirstName().equals(firstName) && student.getSecondName().equals(secondName)){
                        existingStudent= student;
                    }
                }
                return existingStudent;
    }

    private static boolean isStudentExisting(List<Student> students, String firstName, String secondName) {
                for (Student student: students){
                    if(student.getFirstName().equals(firstName) && student.getSecondName().equals(secondName)){
                        return true;
                    }
                }
                return false;
    }
}





