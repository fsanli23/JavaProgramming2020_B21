package day_25Arrayintro;

import java.util.Scanner;

public class months {
    public static void main(String[] args) {

     String [] months ={"jan","feb","march","april","may","june","july","augst","sept","oct","nov","dec"};

        System.out.println("enter number");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        System.out.println(months[num-1]);

        for (int i=0;i<months.length;i++){
            System.out.print(months[i]+",");
        }


    }
}
