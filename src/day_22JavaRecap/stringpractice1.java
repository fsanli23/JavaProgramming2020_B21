package day_22JavaRecap;

import java.util.Scanner;

public class stringpractice1 {
    public static void main(String[] args) {


        String sentence="my name is muhtar";
        String name =sentence.substring(11);

        System.out.println(name);
        String str1="thursday is cool ,it is a fun day";

        String day=str1.substring(0,6);

        System.out.println(day);
String day2=str1.substring(0, str1.indexOf(" "));

        System.out.println(day2);

String s1="https://www.amazon.com";//.com,.edu,.net

String domain=s1.substring(s1.lastIndexOf(".")+1);
        System.out.println(domain);

        String nameofsite=s1.substring(s1.indexOf(".")+1,s1.lastIndexOf("."));

        System.out.println("nameofsite = " + nameofsite);

   String n=      nameofsite.substring(0,1).toUpperCase()+nameofsite.substring(1);

        System.out.println(n);

        System.out.println("==================================");

        Scanner input=new Scanner(System.in);
        String firstname=input.nextLine().toLowerCase();
        String lastname=input.nextLine().toLowerCase();
        input.close();
firstname =firstname.substring(0,1).toUpperCase()+firstname.substring(1);
lastname =lastname.substring(0,1).toUpperCase()+lastname.substring(1);

        String fullname=firstname+" "+lastname;


        System.out.println("fullname = " + fullname);















    }
}
