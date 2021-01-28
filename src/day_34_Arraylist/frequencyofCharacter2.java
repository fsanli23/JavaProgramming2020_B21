package day_34_Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class frequencyofCharacter2 {
    public static void main(String[] args) {



        String str="AAAAABBDDDDDDEEEEEE";
        String result="";
        ArrayList<Character> list=new ArrayList<>();
        for (char each:str.toCharArray())list.add(each);

        for (char each:list){
            int frq=Collections.frequency(list,each);
            if (result.contains(""+each)){
                continue;
            }
            result+=""+each+frq;

        }
        System.out.println(result);







    }
}
