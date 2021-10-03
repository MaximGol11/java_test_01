package Qa_AutomationCourse.Homework_3_1;

public class Manager extends Employee {

    private double numberOfWorkers;

    public Manager(String firstName, int age, char sex, int salaryInDay, int numberOfWorkers) {
        super(firstName, age, sex, salaryInDay);
        this.numberOfWorkers = numberOfWorkers;
    }

    public double getNumberOfWorkers() {
        return numberOfWorkers;
    }

    public void setNumberOfWorkers(int numberOfWorkers) {
        this.numberOfWorkers = numberOfWorkers;
    }

    public double getSalary1(Month[] monthArray) {
        int dayCount = 0;
        double sum = getSalaryInDay();
        for (int i =0; i < monthArray.length; i++) {
            dayCount += monthArray[i].getNumberOfWorkDays();
        }
            sum *= dayCount;
            double sum1 = (sum * (getNumberOfWorkers() / 100));
        return (sum + sum1);
    }

}
