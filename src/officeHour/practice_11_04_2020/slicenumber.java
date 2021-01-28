package officeHour.practice_11_04_2020;

import java.util.Arrays;

public class slicenumber {
    public static void main(String[] args) {

        int number =12345;
        int digit1=number/10000;//1

        int digit2=number%10000/1000;//2

        int digit3=number%10000%1000/100;

        int digit4=number%10000%1000%100/10;

        int digit5=number%10000%1000%100%10;


        System.out.println(digit1);
        System.out.println( digit2);
        System.out.println(digit3);
        System.out.println(digit4);
        System.out.println(digit5);



    }
}
