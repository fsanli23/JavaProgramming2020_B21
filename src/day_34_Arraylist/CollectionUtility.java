package day_34_Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionUtility {
    public static void main(String[] args) {

        ArrayList<Character> chars=new ArrayList<>();
        chars.add('X');
        chars.add('Y');
        chars.add('D');
        chars.add('H');
        chars.add('L');


        Collections.sort(chars);
        System.out.println(chars);

ArrayList<Integer>scores=new ArrayList<>();
        System.out.println("=====================");




        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(10);
        nums.add(100);
        nums.add(5);
        nums.add(8);
        nums.add(25);
        nums.add(500);
        nums.add(253);
        nums.add(7);

     int max=   Collections.max(nums);
      int min= Collections.min(nums) ;


    }
}
