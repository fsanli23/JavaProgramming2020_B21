package day_38_StaticKeyword.scrumTask;

public class developer {

    public String name, Id, Jobtitle;
    public double salary;
    public char gender;

    public static boolean hascodingskill = true;

    public void setInfo(String name, String id, String jobtitle, double salary, char gender) {
        this.name = name;
        this.Id = id;
        this.Jobtitle = jobtitle;
        this.salary = salary;
        this.gender = gender;
    }

    public void coding() {
        System.out.println(Jobtitle + " " + name + "is coding");
    }

    public void fixingBug() {
        System.out.println(Jobtitle + " " + name + "is crying");
    }


}
