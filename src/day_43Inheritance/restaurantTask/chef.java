package day_43Inheritance.restaurantTask;

import day_43Inheritance.personTask.employee;

public class chef extends employee {

    public chef(String name,int age,char gender,double hourlyrate,String jobtitle,String ID){
        setinfo(name, age, gender, hourlyrate, jobtitle, ID);
    }
    public void makeorder(){
        System.out.println(jobtitle+" "+name+"making the order");
    }
public  void cooking(){
    System.out.println(jobtitle+" "+name+"is cooking");
}
}
