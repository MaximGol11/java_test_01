package Qa_AutomationCourse.Homework_3_1;

public class Main {
    public static void main(String[] args) {

        Month january = new Month("January", 31, 15);
        Month february = new Month("February", 28, 19);
        Month march = new Month("March", 31, 19);
        Month april = new Month("April", 30, 20);
        Month may = new Month("May", 31, 16);
        Month june = new Month("June", 30, 20);
        Month jule = new Month("Jule", 31, 20);
        Month august = new Month("August", 31, 20);
        Month september = new Month("September", 30, 21);
        Month october = new Month("October", 31, 18);
        Month november = new Month("November", 30, 20);
        Month december = new Month("December", 31, 17);


        Month[] year = new Month[] {january, february, march, april, may, june, jule, august, september, october, november, december};
        Month[] winter = new Month[] {december, january, february};
        Month[] spring = new Month[] {march, april, may};
        Month[] summer = new Month[] {june, jule, august};
        Month[] autumn = new Month[] {september, october, november};


        Manager manager1 = new Manager("Nikita", 23, 'M', 4000, 10);
        Employee employee1 = new Employee("Nikita", 23, 'M', 4000);


        System.out.println(manager1.getSalary1(year));
        System.out.println(employee1.getSalary(year));




    }
}
