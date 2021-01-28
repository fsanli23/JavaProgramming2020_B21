package day_43Inheritance.personTask;

import day_43Inheritance.personTask.employee;

public class tester extends employee {// tester is  a person,tester is an employee

    /*
    inherited:names,age,gnderr,hourslyrate,jobTitle,ID
    methods:work,setinfo,setinfo,tostring,eat,sleep,
     */

public tester(String name,int age,char gender,double hourlyrate,String jobtitle,String ID){
    setinfo(name, age, gender, hourlyrate, jobtitle, ID);
}

public void testing(){
    System.out.println(jobtitle+"testing");
}



}
