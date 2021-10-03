package Qa_AutomationCourse.Homework_2_1;

public class Salary {
    int getSum(Employee[] employeeArray) {
        int sum = 0;
        for (int i = 0; i < employeeArray.length; i++) {
            sum += employeeArray[i].salary;
        }
        return sum;
    }
}
