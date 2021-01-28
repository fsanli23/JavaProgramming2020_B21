package day_25Arrayintro;

import java.util.Scanner;

public class MyFriends {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("how many friends?");
        int number=scan.nextInt();
     String [] firstname=new String[number];

for (int i=0;i<number;i++){
    System.out.println("enter firstname");
    String f=scan.next();
    firstname[i]=f;

}


for(int i=0;i<number;i++){
    System.out.print(firstname[i]+",");

        }




  //  how many friends do you have?



    }
}
