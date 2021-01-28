package officeHour.practice_12_23_2020.ScrumTask;

public class employee  {
    public String name,Id,jobTitle;
    public final char gender;
    public boolean isfulltime;
    public double salary;

    @Override
    public String toString() {
        return "employee{" +
                "name='" + name + '\'' +
                ", Id='" + Id + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", gender=" + gender +
                ", isfulltime=" + isfulltime +
                ", salary=" + salary +
                '}';
    }

    public employee(String name, String id, String jobTitle, char gender, boolean isfulltime, double salary) {
        this.name = name;
        this.Id = id;
        this.jobTitle = jobTitle;
        this.gender = gender;
        this.isfulltime = isfulltime;
        this.salary = salary;
    }
}
