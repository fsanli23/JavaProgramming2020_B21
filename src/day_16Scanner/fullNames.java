package day_16Scanner;

import java.util.Scanner;

public class fullNames {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("pls enter your name");
      String  name=input.next();
        System.out.println("pls enter your last name");
        String lastname=input.next();
        System.out.println("are you employed?true or false?");
        boolean isemployed=input.nextBoolean();
        double salary=0;

        if (isemployed){
            System.out.println("what is your salary");
            salary=input.nextDouble();

        }
    }
}
