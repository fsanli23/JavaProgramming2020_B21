package day_22JavaRecap;

import java.util.Scanner;

public class stringPractice2 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("enter your first name");

        String f=scan.nextLine();
        System.out.println("enter your last name");
        String l=scan.nextLine();
scan.close();
     String initial=   f.substring(0,1).toUpperCase()+"."+l.substring(0,1).toUpperCase();

        System.out.println("initial = " + initial);

    }
}
