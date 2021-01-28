package day_43Inheritance.personTask;

public class developer extends employee {//dev is a person.dev is a empleyee

    /* variable:nmame,age,gender,hourlyrate,jobtitle,ID
    method:eat(),sleep(),work()

     */
    public  developer(String name,int age,char gender,double hourlyrate,String jobtitle,String ID){
        setinfo(name, age, gender, hourlyrate, jobtitle, ID);
    }

public void coding(){
    System.out.println(jobtitle+name+"is coding");
}


    public String toString() {
        return "developer{" +
                "hourlyrate=" + hourlyrate +
                ", jobtitle='" + jobtitle + '\'' +
                ", ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
