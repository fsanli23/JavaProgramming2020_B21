package officeHour.practice_12_2_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraylistPractice3 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        ArrayList<Integer> list2=list;
        System.out.println(list2);

    }
}
