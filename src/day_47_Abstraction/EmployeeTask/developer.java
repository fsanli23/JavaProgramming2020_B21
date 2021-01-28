package day_47_Abstraction.EmployeeTask;

public class developer extends employee{
    public developer(String name, int age, char gender, String jobtitle, String id, double salary) {
        super(name, age, gender, jobtitle, id, salary);
    }

    @Override
   public  void work() {
        System.out.println("dev are  writing codes");
    }

    @Override
    public  void sleep() {
        System.out.println("dev sleep 6 hour");
    }
}
