package Qa_AutomationCourse.Homework_2;

public class Main {
    public static void main(String[] args) {

        Person alex = new Person("Alex", "Petrov", 25, 0);

        Person olga = new Person("Olga", "Ivanova", 30, 1);

        Employee anrew = new Employee("Andrew", "Sidorov", 24, 0, 200000);
        Employee sergey = new Employee("Sergey", "Vasin", 35, 0, 250000);
        Employee anna = new Employee("Anna", "Druzhinina", 25, 1, 450000);

        Salary sum = new Salary();

        System.out.println(olga.getName());
        System.out.println(alex.getName());
        System.out.println(anrew.isSameName(anrew, "Andrew"));
        System.out.println(sum.getSum(new Employee[]{anrew, sergey, anna}));





}
}