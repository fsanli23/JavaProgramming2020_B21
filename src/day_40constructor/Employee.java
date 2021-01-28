package day_40constructor;

public class Employee {
    public String name,jobtitle,Id;
    public double salary;


    public Employee(String name){
        this.name=name;
    }

    public Employee(String name, String jobtitle) {
        this(name);
        this.jobtitle = jobtitle;
    }

    public Employee(String name, String jobtitle, String id) {
       this(name,jobtitle);
        Id = id;
    }

    public Employee(String name, String jobtitle, String id, double salary) {
       this(name, jobtitle, id);
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobtitle='" + jobtitle + '\'' +
                ", Id='" + Id + '\'' +
                ", salary=" + salary +
                '}';
    }





}
