package officeHour.practice_12_23_2020.ScrumTask;

public class tester extends employee {
    public final static boolean iscool;

    public tester(String name, String id, String jobTitle, char gender, boolean isfulltime, double salary) {
        super(name, id, jobTitle, gender, isfulltime, salary);
    }

    static {
        iscool = true;
    }

}
