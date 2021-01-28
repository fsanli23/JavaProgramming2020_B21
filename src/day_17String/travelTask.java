package day_17String;

import java.util.Scanner;

public class travelTask {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        double cost=0;
        System.out.println("do you have a valid passport?");
String validpassport=input.next();
if (validpassport.equalsIgnoreCase("yes")){

    cost=1000;
    System.out.println("which country do you wanna to go?");
    input.nextLine();
    String counry=input.nextLine();

    System.out.println("how many bags will you have?");
    byte bags=input.nextByte();
    cost+=(bags*50);
    System.out.println("how many people you travel with?");
short numofpeople= input.nextShort();
    if (numofpeople>=3){
        cost-=300;
    }else{
        cost-=(numofpeople*100);
    }
    System.out.println("enter the name of the people you travel with");
    input.nextLine();
    String namesofpeople= input.nextLine();

}else{

}







    }
}
