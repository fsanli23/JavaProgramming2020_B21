package day_26array;

import java.util.Arrays;

public class OddEven {
    public static void main(String[] args) {

      int []  numbers=new int[100]; // last index 99



        for (int i=0;i<=numbers.length-1;i++){
            numbers[i]=i+1;
        }
        System.out.println(Arrays.toString(numbers));




    }
}
