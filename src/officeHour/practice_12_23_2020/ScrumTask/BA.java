package officeHour.practice_12_23_2020.ScrumTask;

public class BA extends employee {
    public BA(String name, String id, String jobTitle, char gender, boolean isfulltime, double salary) {
        super(name, id, jobTitle, gender, isfulltime, salary);
    }
    public void talktoCilent(){
        System.out.println(jobTitle+" "+name+" is talking to client");
    }
}
