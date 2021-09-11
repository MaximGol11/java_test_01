package Qa_AutomationCourse.Homework_2;

public class Salary {


    public int getSum (Employee[] employeeSalary) {
        int counter = 0;
        for ( int i = 0; i < employeeSalary.length; i++) {
            Employee employee = employeeSalary[i];
            String s = employee.toString();
            counter += employee.salary;


        }
        return counter;
    }

}
