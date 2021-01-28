package day_29_Methods;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class VoidMethodPractice2 {
    public static void main(String[] args) {

    }




   public static void ellligibletovote(String citiziennship,int age,boolean isalive) {
        if (citiziennship.equalsIgnoreCase("USA")){
            if (isalive){

            }else{
                System.out.println("you must be co back to life in order to vote");
            }
        }
   }

}
