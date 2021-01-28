package officeHour.practice_11_27_2020;

import java.util.ArrayList;

public class findunique {
    public static void main(String[] args) {

     String []   arr={"a","b","a","c","d","d"};//

        ArrayList<String>uniqueelemntlist=new ArrayList<>();

       for (String element:arr) {
           int count = 0;
           for (String each : arr) {
               if (each.equals(element)) {
                   count++;
               }
           }
           if (count==1){
               uniqueelemntlist.add(element);
           }
       }
        System.out.println(uniqueelemntlist);

    }
}
