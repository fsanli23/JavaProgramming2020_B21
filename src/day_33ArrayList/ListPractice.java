package day_33ArrayList;

import java.util.ArrayList;

public class ListPractice {
    public static void main(String[] args) {

        ArrayList<Integer>list2=new ArrayList<>();
        list2.add(100);
        list2.add(200);
        list2.add(10);
        list2.add(300);
        list2.add(1000);
        list2.add(0/2);

        int max=list2.get(0);
        int min=list2.get(0);


        for (int each:list2){
            if (each>max){
                max=each;
            }
            if (each<min){
                min=each;
            }
        }

        System.out.println("min = " + min);
        System.out.println("max = " + max);


        
        int [] arr={1,2,3,4,5,};
        System.out.println(Math.max(arr[0],arr[4]));
    }
}
