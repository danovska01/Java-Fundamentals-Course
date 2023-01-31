package _16_ObjectsAndClasses_Ex;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class _05_Students {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write a program that receives n count of students and orders them by grade (in descending).
        // Each student should have first name (string), last name (string) and grade (floating-point number).

        int n = Integer.parseInt(scanner.nextLine());
        List<Student>studentList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String input= scanner.nextLine();
            Student currentStudent = new Student(input.split(" ")[0], input.split(" ")[1], Double.parseDouble(input.split(" ")[2]));
            studentList.add(currentStudent);
        }
        studentList.sort(Comparator.comparing(Student::getGrade).reversed());
        for(Student a : studentList){
            System.out.println(a);
        }

    }
    static class Student{
        private String name;
        private String lastName;
        private double grade;

        public double getGrade() {
            return grade;
        }



        public Student(String name, String lastName, double grade) {
            this.name = name;
            this.lastName= lastName;
            this.grade= grade;
        }
        @Override
        public String toString() {
            String toStringReturn = String.format("%s %s: %.2f", this.name, this.lastName, this.grade);
            return toStringReturn;
        }





    }
}
