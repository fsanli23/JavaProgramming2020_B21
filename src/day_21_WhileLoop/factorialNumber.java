package day_21_WhileLoop;

import java.util.Scanner;

public class factorialNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a number");
        int num=scan.nextInt();
       // int num=5;
        int result=1;
        //3:3*2*1

        for (int i=num;i>=1;i--){
            result*=i;
        }

        System.out.println(result);










    }
}
