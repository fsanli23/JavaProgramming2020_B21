package day_32_LocalDate_WrapperClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class dateTimePractice1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter first person your birth year,month,day");//john
        LocalDate dof1=LocalDate.of(scan.nextInt(), scan.nextInt(), scan.nextInt());


        System.out.println("enter first person your birth year,month,day");//erin
        LocalDate dof2=LocalDate.of(scan.nextInt(), scan.nextInt(), scan.nextInt());

        if (dof1.isBefore(dof2)){
            System.out.println("first person is older");
        }else if (dof2.isBefore(dof1)){
            System.out.println("second person is older");
        }else{
            System.out.println("same age");
        }

       /*  //current age
        int age1=LocalDate.now().getYear()-dof1.getYear();
        int age2=LocalDate.now().getYear()-dof2.getYear();
        //after 30 year
        int after1=age1+30;
        int after2=age2+30;*/

        //System.out.println("after thirthy years,person a will be :"+after1);
      //                                                                                                                                       System.out.println("after thirthy years,person b will be :"+after2);

    }
}
