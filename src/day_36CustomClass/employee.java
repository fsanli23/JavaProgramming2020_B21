package day_36CustomClass;

import java.time.LocalDate;

public class employee {


    public String name, jobtitle, ID, companyName;


    public double salary;
    public LocalDate hiredate;
    public char gender;

    public void setInfo(String name, char gender, String jobtitle, String companyName, double salary, String ID, LocalDate hiredate) {
        this.name = name;//instance=local
        this.gender = gender;
        this.jobtitle = jobtitle;
        this.companyName = companyName;
        this.salary = salary;
        this.ID = ID;
        this.hiredate = hiredate;

    }

    public void getInfo() {
        System.out.println("name :" + name + "gender:" + gender + "jobtitle: " + jobtitle + "company name: " + companyName + "salary: " + salary + " Id: " + ID
                + "hiredate: " + hiredate);
    }
    public void working(){
        System.out.println(name+"is working");
    }


}
