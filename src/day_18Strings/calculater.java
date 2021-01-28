package day_18Strings;

import java.util.Scanner;

public class calculater {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);


        System.out.println("enter a number");
        double n1=scan.nextDouble();
        System.out.println("enter math operator");
        char operator=scan.next().charAt(0);

        System.out.println("enter a number");
        double n2=scan.nextDouble();
          boolean isvalidoperator=operator=='*'||operator=='-'||operator=='/'||operator=='%'||operator=='+';

        if (isvalidoperator) {
            if (operator=='*'){
                System.out.println("multipication:"+(n1*n2));
            }else if (operator=='/'){
                System.out.println("division:" +(n1/n2));
            }
            else if (operator=='%'){
                System.out.println("remainder"+(n1%n2));
            }else if (operator=='+'){
                System.out.println("addition" +(n1+n2));
            }
            else{
                System.out.println("invalid entry");
            }
        }








    }
}
