package day_50Polymorphism;

import day_47_Abstraction.ShapeTask.circle;

import java.util.ArrayList;
import java.util.Arrays;

public class reference_class_casting {

    public static void main(String[] args) {

        //implicit casting:smaller to larger
        int a = 10;
        double b = (double) a;

        //explicit casting=larger to smaller
        double d = 10.5;
        int c = (int) d;

        System.out.println("==================================================================");


        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

list.remove(Integer.parseInt("50"));
int m=Integer.parseInt("50");
       
    }

}
