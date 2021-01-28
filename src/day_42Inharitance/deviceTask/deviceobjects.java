package day_42Inharitance.deviceTask;

public class deviceobjects   {
    public static void main(String[] args) {


        tv tv1=new tv("samsung","sd5545",500);


        System.out.println(tv1);

        tv1.cahnnelup();
        tv1.turnoff();
        tv1.turnon();

phone phone1=new phone("iphone","iphone 12",1000);


phone1.call(255125);
phone1.text(351565613);



    }
}
