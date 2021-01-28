package officeHour.practice_12_2_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class arrayListPractice {
    public static void main(String[] args) {





        ArrayList<Integer>list1=new ArrayList<>();
        list1.addAll(Arrays.asList(10,20,30,40,50,60,70));
        System.out.println(list1.isEmpty());//false

        System.out.println(list1.lastIndexOf(50));



    }

}
