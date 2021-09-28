package Qa_AutomationCourse.Homework_2_1;

public class Employee {
    Person person;
    int salary;

    public Employee(String name, int age, char sex, int salary) {
        person = new Person(name, age, sex);
        this.salary = salary;
    }
    boolean isSameName(String employeeName) {
        return (employeeName.equals(person.name));
    }

}
