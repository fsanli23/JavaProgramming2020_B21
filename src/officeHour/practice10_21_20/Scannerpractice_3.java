package officeHour.practice10_21_20;

import java.util.Scanner;

public class Scannerpractice_3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("pls enter your gender");
        String gender = scan.next();
        System.out.println("enteer your age");
        int age = scan.nextInt();
        scan.nextLine();
        System.out.println("full name");
        String fullName = scan.nextLine();
        System.out.println("zip code");
        int zipcode = scan.nextInt();
        scan.nextLine();
        System.out.println("country name");
        String counry = scan.nextLine();
        System.out.println("salary");
        double salary = scan.nextDouble();
        scan.nextLine();
        System.out.println("company name");
        String company = scan.nextLine();
        System.out.println("adress");
        String adress = scan.nextLine();
        scan.close();
    }
}
