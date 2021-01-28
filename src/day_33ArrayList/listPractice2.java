package day_33ArrayList;

import java.util.ArrayList;

public class listPractice2 {
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>()  ;
        names.add("katy");
        names.add("amir");
        names.add("nadeire");
        names.add("erojon");
        names.add("ilgar");
        names.add("fatih");
        names.add("john");

        names.remove(1);

        System.out.println(names);


    }

}
