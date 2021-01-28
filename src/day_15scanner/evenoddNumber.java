package day_15scanner;

import java.util.Scanner;

public class evenoddNumber {
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        System.out.println("pls enter no");
        int number=input.nextInt();


        if (number%2==0){
            System.out.println(number+"is odd");
        }else{
            System.out.println("not even");
        }
    }
}
