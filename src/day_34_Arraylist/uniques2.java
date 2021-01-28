package day_34_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class uniques2 {
    public static void main(String[] args) {
        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,66,7,8,91,11,22,55,33,65,66,7));
        numbers.removeIf(p -> Collections.frequency(numbers,p)>1);
        System.out.println(numbers);
        System.out.println("==================================");

        String str="aasdfarfeadvdadcaht";
        ArrayList<String>list=new ArrayList<>(Arrays.asList(str.split("")));
        list.removeIf(p->Collections.frequency(list,p)>1);
        System.out.println(list);



    }
}
