package day_37CustomClass;

import java.time.LocalDate;

public class CybertekSchool {

    public String name, ID;
    public LocalDate  dob;
    public int age;
    public char gender;
    public double gpa;

public void setInfo(String name, String ID, LocalDate dob, char gender, double gpa){
    this.name=name;
    this.ID=ID;
    this.dob=dob;
    this.gender=gender;
    this.gpa=gpa;
}



    public String toString() {
        return "CybertekSchool{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                ", gender=" + gender +
                ", gpa=" + gpa +
                '}';
    }
}
