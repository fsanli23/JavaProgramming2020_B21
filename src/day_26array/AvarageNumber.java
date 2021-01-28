package day_26array;

import java.util.Scanner;

public class AvarageNumber {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("how many number");
        int length=scan.nextInt();
        int[] numbers=new int[length];
        int sum=0;
        for (int i=0;i<=length-1;i++){
            System.out.println("enter a number");
          numbers[i]=scan.nextInt();
          sum+=numbers[i];
        }
        double avarage=sum/length;
        System.out.println("sum = " + sum);
        System.out.println(avarage);
    }
}
