package day_33ArrayList;

import java.util.Arrays;

public class WrapperClassPractices {
    public static void main(String[] args) {
        String str="a1b2c3";
int [] l={3,2,3,6,33,8};
       /* 3. write a program that can return the sum of all the digits from a string
        ex:
        input: "a1b2c3"
        output: 6
        (1+2+3= 6)
        input: "Today's date is 04/27/2020"
        output: 17
        (0+4+2+7+2+0+2+0=17)
        */

        System.out.println(Arrays.toString(l));;

for (int each:l){
    if (each%2==0){
        break;
    }
    System.out.println(each);
}


    }
}
