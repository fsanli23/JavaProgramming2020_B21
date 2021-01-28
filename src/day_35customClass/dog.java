package day_35customClass;

import java.time.LocalDate;

public class dog {
    public String nickname;
    public String breed;
    public String size;
    public char gender;
    public String color;
    public LocalDate dob;

    //set the instance variable of dog objects
    public void setInfo(String dognickname,String dogbreed,String dogsize,char doggender,String dogcolor,LocalDate dogdob){
        nickname=dognickname;
        breed=dogbreed;
        size=dogsize;
        gender=doggender;
        color=dogcolor;
        dob=dogdob;
    }


    public void getInfo(){
        System.out.println("name"+nickname+", breed"+breed+" ,gender "+gender+"color:"+color+"");
    }




}
