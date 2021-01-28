package officeHour.practice_11_27_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class removeduplicates {
    public static void main(String[] args) {

        int []arr={1,1,2,3,3,4};//[1,2,3,4]
        ArrayList<Integer>list=new ArrayList<>();//[1,2,3,4]
        for (int each:arr){
            if (!list.contains(each)){
                list.add(each);
            }
        }
        System.out.println(list);
        int []nondup=new int[list.size()];
        for (int i=0;i<=nondup.length-1;i++){
            nondup[i]=list.get(i);
        }
        System.out.println(Arrays.toString(nondup));

    }
}
