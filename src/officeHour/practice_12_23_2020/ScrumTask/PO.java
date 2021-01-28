package officeHour.practice_12_23_2020.ScrumTask;

public class PO extends employee {

    public PO(String name, String id, char gender, boolean isfulltime, double salary) {
        super(name, id, "product owner", gender, isfulltime, salary);
    }


    public void acceptProduct() {
        System.out.println(jobTitle + " " + name + " accepted the order");
    }

    public void writeuserStories() {
        System.out.println(jobTitle + " " + name + "is writing user stories");
    }


}
