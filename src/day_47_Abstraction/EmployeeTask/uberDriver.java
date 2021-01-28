package day_47_Abstraction.EmployeeTask;

public  final class uberDriver extends employee{

    public uberDriver(String name, int age, char gender, String jobtitle, String id, double salary) {
        super(name, age, gender, jobtitle, id, salary);

    }

    @Override
    void work() {
        System.out.println("driving caars");
    }

    @Override
    protected void sleep() {
        System.out.println("uber drivers  suslualy sleep 9 hours ");
    }


    public static void main(String[] args) {

    }



}
