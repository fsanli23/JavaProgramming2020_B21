package day_27_forEachLoop;

import java.util.Arrays;

public class uniqueChars {
    public static void main(String[] args) {

       String str="aabbcddeef";

       char[]arr=str.toCharArray();
       //String []arr=str.split("");
        System.out.println(Arrays.toString(arr));

        for (int j=0;j<arr.length;j++) {


            char element = arr[j];
            int frequency = 0;
            for (int i = 0; i < str.length(); i++) {
                if (arr[i] == element) {
                    frequency++;
                }
            }

            if (element == 1) {

                System.out.println(element + "");
            }


        }






    }
}
