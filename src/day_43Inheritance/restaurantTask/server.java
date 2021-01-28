package day_43Inheritance.restaurantTask;

import day_43Inheritance.personTask.employee;

public class server extends employee {

  public  server(String name,int age,char gender,double hourlyrate,String jobtitle,String ID){
      setinfo(name, age, gender, hourlyrate, jobtitle, ID);
  }

    public  void takeorder(){
        System.out.println(jobtitle+" "+name+"is taking order");
    }
    public void cleantable(){
        System.out.println(jobtitle+" "+name+"is cleaning table");
    }




}
