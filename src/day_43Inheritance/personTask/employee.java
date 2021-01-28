package day_43Inheritance.personTask;

public class employee extends person { //employee is a person
    /*
    variable:name,age,gender;
    methods:set info,eat,sleep,tostring;
     */

    public  double hourlyrate;
    public  String jobtitle,ID;

    public void work(){
        System.out.println(name+"is working");
    }
    public void setinfo(String name,int age,char gender,double hourlyrate,String jobtitle,String ID){
        setinfo(name, age, gender);
        this .hourlyrate=hourlyrate;
        this.ID=ID;
        this.jobtitle=jobtitle;
    }
public double calcsalary(){
        return hourlyrate*40*52;
}

    public String toString() {
        return "employee{" +
                "hourlyrate=" + hourlyrate +
                ", jobtitle='" + jobtitle + '\'' +
                ", ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
