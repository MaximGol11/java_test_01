package Qa_AutomationCourse.Homework_2;

public class Employee {

    String first_name;
    String last_name;
    int age;
    int gender;  // 0 == male, 1 == female
    int salary;

    public Employee(String first_name, String last_name, int age, int gender, int salary) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    public boolean isSameName(Employee anrew, String employee_name) {
        return (employee_name.equals(first_name));
    }


}
