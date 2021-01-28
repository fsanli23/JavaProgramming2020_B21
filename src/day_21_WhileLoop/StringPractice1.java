package day_21_WhileLoop;

import java.util.Scanner;

public class StringPractice1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //String word = scan.nextLine();

        int lastletter;

        System.out.println("====================================");

        System.out.println("enter your building no: ");
        String buildingno = scan.next();
        scan.nextLine();

        System.out.println("enter street name : ");
        String streetname = scan.nextLine();

        System.out.println("enter apt no:");
        int aptno = scan.nextInt();
        scan.nextLine();

        System.out.println("enter city:");
        String city = scan.nextLine();


        System.out.println("enter state:");
        String state=scan.nextLine();

        System.out.println("zipcode");
        int zipcode=scan.nextInt();

        String adress=buildingno+" "+streetname+","+aptno+" "+city+" "+state+","+zipcode ;
        System.out.println(adress);
    }
}
