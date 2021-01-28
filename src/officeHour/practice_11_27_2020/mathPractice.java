package officeHour.practice_11_27_2020;

import java.text.DecimalFormat;

public class mathPractice {
    public static void main(String[] args) {

         double n1=Math.pow(2,2);
        double n2=Math.pow(9,3);

        int n3=Math.max(8,9);
int n4=Math.min(1,5);


        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(Math.PI);
        System.out.println(Math.E);
        System.out.println(Math.sqrt(80));

      double  r1=  calculateAreaCircle(3);
        System.out.println(r1);
    }


    public static double calculateAreaCircle(double r){
        return Math.PI*Math.pow(r,2);
    }


}
