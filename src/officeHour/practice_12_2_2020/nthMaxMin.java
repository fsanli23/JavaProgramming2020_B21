package officeHour.practice_12_2_2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class nthMaxMin {
    public static void main(String[] args) {
        ArrayList <Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,01,022,1,2));

       list.removeIf(p->p==Collections.max(list));

    }
}
