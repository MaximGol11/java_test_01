package Qa_AutomationCourse.Homework_2;

public class Person {
    String first_name;
    String last_name;
    int age;
    int gender;
    // 0 == male, 1 == female

 // constructor
    public Person(String first_name, String last_name, int age, int gender) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
        this.gender = gender;
    }

    public String getName () {
        if (gender == 0) {
            return ("Mr. " + first_name + " " + last_name);
        } else if (gender == 1) {
            return ("Mrs. " + first_name + " " + last_name);
        } else {
            return ("Error, gender only 0 or 1");
        }
    }

}
