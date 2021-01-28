package officeHour.practice_12_23_2020.ScrumTask;

public class developer extends employee{
    public developer(String name, String id, String jobTitle, char gender, boolean isfulltime, double salary) {
        super(name, id, jobTitle, gender, isfulltime, salary);
    }

    public void fixingbug(){
        System.out.println(jobTitle+" "+name+" is fixing the bug");
    }






}
