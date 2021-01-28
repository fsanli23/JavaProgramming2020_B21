package day_27_forEachLoop;

import java.util.Arrays;

public class combineTwoArray {
    public static void main(String[] args) {

        int [] arr1={1,2,3,4};
        int [] arr2={5,6,7};

        int[] arr3=new int[arr1.length+arr2.length];
        int j=0;//represent the index num of 3rd array
        System.out.println(Arrays.toString(arr3));

for (int each:arr1){
   arr3 [j++]=each;
}







    }
}
