package Qa_AutomationCourse.Homework_3_1;

public class Month {
    private String name;
    private int numberOfDays;
    private int numberOfWorkDays;


    public Month(String name, int numberOfDays, int numberOfWorkDays) {
        this.name = name;
        this.numberOfDays = numberOfDays;
        this.numberOfWorkDays = numberOfWorkDays;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public int getNumberOfWorkDays() {
        return numberOfWorkDays;
    }
}
