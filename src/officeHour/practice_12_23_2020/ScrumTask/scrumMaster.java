package officeHour.practice_12_23_2020.ScrumTask;

public class scrumMaster extends employee {

    public scrumMaster(String name, String id, char gender, boolean isfulltime, double salary) {
        super(name, id,"sucrum master", gender, isfulltime, salary);
    }
    public void organizeMeeting(){
        System.out.println(jobTitle+" "+ name+" is orginizing meeting");
    }



}
