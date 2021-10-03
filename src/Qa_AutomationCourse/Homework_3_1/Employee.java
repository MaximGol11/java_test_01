package Qa_AutomationCourse.Homework_3_1;

public class Employee {

    private String firstName;
    private int age;
    private char sex;
    private int salaryInDay;

    public Employee(String firstName, int age, char sex, int salaryInDay) {
        this.firstName = firstName;
        this.age = age;
        this.sex = sex;
        this.salaryInDay = salaryInDay;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public char getSex() {
        return sex;
    }

    public int getSalaryInDay() {
        return salaryInDay;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setSalaryInDay(int salaryInDay) {
        this.salaryInDay = salaryInDay;
    }

    public int getSalary(Month[] monthArray) {
        int dayCount = 0;
        int sum = salaryInDay;
        for (int i = 0; i < monthArray.length; i++ ) {
            dayCount += monthArray[i].getNumberOfWorkDays();
        }
            sum *= dayCount;
        return sum;
    }
}
