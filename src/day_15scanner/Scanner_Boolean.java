package day_15scanner;

import java.util.Scanner;

public class Scanner_Boolean {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in)   ;
        System.out.println("enter true or false");
        boolean b=input.nextBoolean();


        System.out.println("value"+b);
        System.out.println("opposite "+!b);



    }
}
