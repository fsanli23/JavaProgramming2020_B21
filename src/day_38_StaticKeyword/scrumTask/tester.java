package day_38_StaticKeyword.scrumTask;

public class tester {
    public String name, Id, JobTitle, companyName;
    public double salary;
    public char gender;


    public void setInfo(String name, String id, String jobTitle, String companyName, double salary, char gender) {
        this.name = name;
        this.Id = id;
        this.JobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
        this.gender = gender;
    }

    public void smokeTEsting() {
        System.out.println(name + "is performing smoke testing");
    }

    public void creatingTicket() {
        System.out.println(name + "is creating ticket");
    }


    public  String toString() {
        return "tester{" +
                "name='" + name + '\'' +
                ", Id='" + Id + '\'' +
                ", JobTitle='" + JobTitle + '\'' +
                ", companyName='" + companyName + '\'' +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }
}




