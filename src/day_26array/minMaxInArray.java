package day_26array;

import java.util.Scanner;

public class minMaxInArray {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("how many number would you like to enter");
        int length=scan.nextInt();

        int[] number= new int [length];
        for (int i=0;i<=length-1;i++){
            System.out.println("enter a number");
            number[i]=scan.nextInt();
        }








    }
}
