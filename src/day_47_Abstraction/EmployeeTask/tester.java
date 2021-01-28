package day_47_Abstraction.EmployeeTask;

public class tester extends employee{

    public tester(String name, int age, char gender, String jobtitle, String id, double salary) {
        super(name, age, gender, jobtitle, id, salary);
    }

    @Override
    void work() {
        System.out.println("testers test application");
    }

    @Override
    protected void sleep() {
        System.out.println("testers sleep 8 hours every day.");
    }







}
