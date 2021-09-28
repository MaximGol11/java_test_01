package Qa_AutomationCourse.Homework_3;

public class Employee {
    private String first_name;
    private String last_name;
    private int age;
    private int gender; // 0 - male, 1 - female
    private int salaryInDay;

    public Employee(String first_name, String last_name, int age, int gender, int salaryInDay) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
        this.gender = gender;
        this.salaryInDay = salaryInDay;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getSalaryInDay() {
        return salaryInDay;
    }

    public void setSalaryInDay(int salaryInDay) {
        this.salaryInDay = salaryInDay;
    }

    public int getSalary(Month[] monthsArray) {
        int sum = 0;
        for (int i = 0; i < monthsArray.length; i++) {
            Month month = monthsArray[i];

        }
        return  sum;
    }




}

