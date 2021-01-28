package day_47_Abstraction.EmployeeTask;

public abstract class employee extends person{

    public String jobtitle,Id;
    public double salary;

    public employee(String name, int age, char gender, String jobtitle, String id, double salary) {
        super(name, age, gender);
        this.jobtitle = jobtitle;
        Id = id;
        this.salary = salary;
    }

    abstract void work();


    @Override
    public String toString() {
        return "employee{" +
                "jobtitle='" + jobtitle + '\'' +
                ", Id='" + Id + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
