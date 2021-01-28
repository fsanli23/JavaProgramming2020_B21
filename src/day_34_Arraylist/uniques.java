package day_34_Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class uniques {
    public static void main(String[] args) {

        String str="aabaacdddddeffffffffffghhhhhhi";

        ArrayList<Character> list=new ArrayList<>();
        for (char each:str.toCharArray()){
            list.add(each);
        }

for (Character each:list){
   if (Collections.frequency(list,each)==1){
       System.out.println(each);
   }
}





    }
}
