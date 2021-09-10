package Qa_AutomationCourse.Homework_2;

public class Main {
    public static void main(String[] args) {

        Person alex = new Person("Alex", "Petrov", 25, 0);

        Person anna = new Person("Anna", "Ivanova", 30, 1);

        Employee anrew = new Employee("Andrew", "Sidorov", 24, 0, 200000);
        Employee sergey = new Employee("Sergey", "Vasin", 35, 0, 250000);

        System.out.println(anna.getName());
        System.out.println(alex.getName());
        System.out.println(anrew.isSameName("Andrew"));




}
}