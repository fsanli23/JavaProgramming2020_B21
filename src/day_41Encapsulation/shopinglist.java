package day_41Encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class shopinglist {
    public static void main(String[] args) {

        ArrayList<item>items=new ArrayList<>();
        items.addAll(Arrays.asList(
             new item("sanitizer",2,5) ,
             new item("mask",5,3),
             new item("toilet paper",1,6),
             new item("pasta",6,1.),
             new item("watermeleon",1,3)
        ));
        double total=0;
        System.out.println(items);
         for (item eachitem:items){
             total+=eachitem.calscost();
         }




    }
}
