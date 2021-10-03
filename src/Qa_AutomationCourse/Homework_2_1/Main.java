package Qa_AutomationCourse.Homework_2_1;

public class Main {
    public static void main (String[] args) {

        Employee employee_1 = new Employee("Anton", 25, '1', 200000);
        Employee employee_2 = new Employee("Anna", 23, '0', 150000);
        Employee employee_3 = new Employee("Misha", 23, '1', 255000);

        Employee[] employees = new Employee[]{employee_1, employee_2, employee_3};
        Salary employees_salary_sum = new Salary();
       // employees_salary_sum.getSum(employees);


        System.out.println(employee_1.isSameName(employee_1));
        System.out.println(employee_2.isSameName(employee_2));
        System.out.println(employees_salary_sum.getSum(employees));

    }
}
