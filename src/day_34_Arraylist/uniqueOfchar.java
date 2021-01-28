package day_34_Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class uniqueOfchar {
    public static void main(String[] args) {

        String str="AAAABBCDDDDDDEEEE";//A3B2C16D4E
        ArrayList<String>list=new ArrayList<>();
String result="";
       /* for (char each:str.toCharArray()){
            list.add(each);
        }

        for (char each:list){
            int fr=Collections.frequency(list,each);
            System.out.print(""+fr+each);
        }*/
for (String each:str.split(""))list.add(each);
        System.out.println(list);
        for (String each:list){
            int frequency=Collections.frequency(list,each);
            if (!result.contains(each))
                    result+=each+frequency;
        }

        System.out.println(result);


    }
}
