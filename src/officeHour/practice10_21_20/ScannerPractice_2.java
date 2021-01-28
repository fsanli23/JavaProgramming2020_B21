package officeHour.practice10_21_20;

import java.util.Scanner;

public class ScannerPractice_2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a price");

        double price= scan.nextDouble();

        System.out.println("price = " + price);

        System.out.println("entr the name of the items:");

 String item=scan.next();

        System.out.println("item = " + item);

     scan.nextLine();
        System.out.println("enter your full name");

String fullname=scan.nextLine();
scan.close();
        System.out.println("fullname = " + fullname);


    }
}
