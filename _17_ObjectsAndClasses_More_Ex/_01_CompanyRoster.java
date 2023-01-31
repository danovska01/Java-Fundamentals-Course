package _17_ObjectsAndClasses_More_Ex;

import java.util.*;
import java.util.stream.Collectors;

public class _01_CompanyRoster {
    // Define a class Employee that holds the following information:
    // name, salary, position, department, email and age. The name, salary, position and department are
    // mandatory while the rest are optional.
    static class Employee {
        private String name;
        private double salary;
        private String position;
        private String department;

        private String email;
        private String age;


        public Double getSalary() {
            return salary;
        }

        public Employee(String name, Double salary, String position, String department) {
            this.name = name;
            this.salary = salary;
            this.position = position;
            this.department = department;
        }
        public void setEmailAndOrAge(List <String> list){
            if(list.size() == 5){
                if(list.get(4).length() > 3){
                    this.email = list.get(4);
                }else{
                    this.age = list.get(4);
                }
            }else if(list.size() == 6){
                this.email = list.get(4);
                this.age = list.get(5);
            }

        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Your task is to write a program which takes N lines of employees from the console and
        // calculates the department with the highest average salary and prints for each employee in that department
        // his name, salary, email and age – sorted by salary in descending order.

        // input;
        // 4
        //Peter 120.00 Dev Development peter@abv.bg 28
        //Todor 333.33 Manager Marketing 33
        //Itan 840.20 ProjectLeader Development itan@itan.com
        //George 0.20 Freeloader Nowhere 18

        int n = Integer.parseInt(scanner.nextLine());
        List<Employee>listOfEmployees= new ArrayList<>();
        for (int i = 1; i <=n ; i++) {
            String input= scanner.nextLine();
            List <String> tokens = Arrays.stream(input.split(" ")).collect(Collectors.toList());
            String name = tokens.get(0);
            double salary = Double.parseDouble(tokens.get(1));
            String position = tokens.get(2);
            String department = tokens.get(3);
            Employee currentEmployee = new Employee(name, salary, position, department);
            currentEmployee.setEmailAndOrAge(tokens);
            listOfEmployees.add(currentEmployee);

        }
        // calculates the department with the highest average salary and prints for each employee in that department
        // his name, salary, email and age –sorted by salary in descending order.
        List <String> departments = new ArrayList<>();
        List <Double> salaries = new ArrayList<>();
        for (int i = 0; i < listOfEmployees.size(); i++) {
            if(!departments.contains(listOfEmployees.get(i).department)){
                departments.add(listOfEmployees.get(i).department);
                salaries.add(0.0);
            }
            int index = 0;
            for (int j = 0; j < departments.size(); j++) {
                if(departments.get(j).equals(listOfEmployees.get(i).department)){
                    index = j;
                }
            }
            salaries.set(index, salaries.get(index) + listOfEmployees.get(i).salary);
        }
        double max = 0;
        String maxDepartment = "";
        for (int i = 0; i < salaries.size(); i++) {
            if(salaries.get(i) > max){
                max = salaries.get(i);
                maxDepartment = departments.get(i);
            }
        }
        System.out.printf("Highest Average Salary: %s\n", maxDepartment);
        for (int i = 0; i < listOfEmployees.size(); i++) {
            if(!listOfEmployees.get(i).department.equals(maxDepartment)){
                listOfEmployees.remove(i);
                i = -1;
            }

        }
        listOfEmployees.sort(Comparator.comparing(Employee::getSalary).reversed());

        //If an employee doesn’t have an email – in place of that field you should print "n/a" instead, if he doesn’t
        // have an age – print "-1" instead.
        for (int i = 0; i < listOfEmployees.size(); i++) {
            System.out.printf("%s %.2f ", listOfEmployees.get(i).name, listOfEmployees.get(i).salary);
            if(listOfEmployees.get(i).email == null){
                System.out.print("n/a ");
            }else{
                System.out.print(listOfEmployees.get(i).email + " ");
            }
            if(listOfEmployees.get(i).age == null){
                System.out.printf("-1\n");
            }else{
                System.out.printf("%s\n", listOfEmployees.get(i).age);
            }
        }

    }
}
