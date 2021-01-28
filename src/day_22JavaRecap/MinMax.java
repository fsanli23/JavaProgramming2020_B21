package day_22JavaRecap;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int min=2147483647;
        int max=-2147483647;
        for (int i=1;i<=5;i++) {
            System.out.println("enter a number");
            int no = scan.nextInt();
            if (no<min){//if the input smaller than previous min number
                min=no;
            }if (no>max){//if the input greate than previuos max number
                max=no;
            }

        }
scan.close();
        System.out.println(min+","+max);
    }
}
