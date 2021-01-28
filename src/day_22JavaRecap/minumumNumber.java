package day_22JavaRecap;

import java.util.Scanner;

public class minumumNumber {
    public static void main(String[] args) {


                Scanner input =new Scanner(System.in);
        int min=214748647;// whatever user put in will be most likely smaller than this no

        for (int i=1;i<=5;i++){
            System.out.println("enter a number");
            int  no=input.nextInt();
            if (no<min){
               min=no;
            }
        }
        System.out.println(min);


    }
}
