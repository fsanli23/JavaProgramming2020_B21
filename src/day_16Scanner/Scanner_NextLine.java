package day_16Scanner;

import java.util.Scanner;

public class Scanner_NextLine {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter your age");
        int age =input.nextInt();
        input.nextLine();
        System.out.println("enter you name");
        String fullname=input.nextLine();
        System.out.println("name "+fullname);
        System.out.println("age"+age);




    }
}
