package Qa_AutomationCourse.Homework_2_1;

public class Person {
    String name;
    int age;
    char sex;

    public Person(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    String getName() {
        if (sex == 1) {
            return ("Mr " + name);
        } else {
            return ("Mrs " + name);
        }
    }

}
