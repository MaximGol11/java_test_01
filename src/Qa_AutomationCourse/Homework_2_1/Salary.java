package Qa_AutomationCourse.Homework_2_1;

public class Salary {
    int getSum(Employee[] employeeArray) {
        int sum = 0;
        for (int i = 0; i < employeeArray.length; i++) {
            Employee employee = employeeArray[i];
            sum += employee.salary;
        }
        return sum;
    }
}
