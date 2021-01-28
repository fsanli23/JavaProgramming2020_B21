package day_45Exception.phoneTask;

import java.util.Scanner;

public class throwKeyWord {
    public static void main(String[] args) {


  Scanner scan=new Scanner(System.in);


        System.out.println("enter your age");


        int age= scan.nextInt();

        if (age<0||age>150){

            throw  new RuntimeException("invalid age number");
        }



        if (age>=21){
            System.out.println("eligible");
        }else {
            System.out.println("not eleigible");
        }









    }
}
