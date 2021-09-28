package Qa_AutomationCourse.Homework_2;

public class Person {
    String first_name;
    String last_name;
    int age;
    int sex;
    // 0 == male, 1 == female

 // constructor
    public Person(String first_name, String last_name, int age, int gender) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
        this.sex = gender;
    }

    public String getName () {
        if (sex == 0) {
            return ("Mr. " + first_name + " " + last_name);
        } else if (sex == 1) {
            return ("Mrs. " + first_name + " " + last_name);
        } else {
            return ("Error, gender only 0 or 1");
        }
    }

}
