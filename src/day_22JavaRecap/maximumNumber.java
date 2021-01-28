package day_22JavaRecap;

import java.util.Scanner;

public class maximumNumber {
    public static void main(String[] args) {

       // Scanner  object:1
        //max:1
       // "enter a number":5
       // nextInt():5

        Scanner scan=new Scanner(System.in);
        int max=-999999;//user most likely to enter a number thats greter than -99999



        for (int i=1;i<=5;i++){
            System.out.println("enter a number");
            int n= scan.nextInt();//-1,3,4,5
//scan.close();
            if (n>max){
                max=n;
            }


        }

        System.out.println(max);
scan.close();
    }
}
