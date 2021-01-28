package day_15scanner;

import java.util.Scanner;

public class warmup2 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("pls enter your age");
        byte age=input.nextByte();
        System.out.println("pls enter your favorite no");
        long favno=input.nextLong();
        System.out.println("are you a student");
        boolean isstudent=input.nextBoolean();
        System.out.println();
    }
}
