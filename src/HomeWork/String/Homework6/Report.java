package HomeWork.String.Homework6;

import java.util.Formatter;

public class Report{
    public static void main(String[] args) {
        Employee employee1 = new Employee("Ivanov Ivan", "1200");
        Employee employee2 = new Employee("Karas Ruslan", "1900");
        Employee employee3 = new Employee("Petlya Irina", "1100");
        Employee [] employees = {employee1, employee2, employee3};
        generateReport(employees);

    }
    public static void generateReport(Employee [] employees){
        for(Employee employee : employees){
            System.out.printf("Employee %5s average salary is  %5s\n ",  employee.getFullname(), employee.getSalary());
        }

    }
}
