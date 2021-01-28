package day_34_Arraylist;

import java.util.ArrayList;

public class warmUp {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
//list.clear();
        //list.set(list.size()-1,0);
        System.out.println(list);

        for (int i = 0; i <= list.size() - 1; i++) {
            int eachy = list.get(i);
            if (eachy % 2 != 0)
                list.set(i, eachy * 2);


            System.out.println(list);

            System.out.println("========================================");

            int[] scores = {65, 75, 77, 85, 96, 5, 88, 46, 25, 96, 88, 99, 37};
            ArrayList<Integer> Alist = new ArrayList<>();
            ArrayList<Integer> Blist = new ArrayList<>();
            ArrayList<Integer> Clist = new ArrayList<>();
            ArrayList<Integer> Dlist = new ArrayList<>();
            ArrayList<Integer> Flist = new ArrayList<>();

            for (int each : scores) {
                if (each >= 90) {
                    Alist.add(each);
                } else if (each >= 80) {
                    Blist.add(each);
                } else if (each >= 70) {
                    Clist.add(each);
                } else if (each >= 60) {
                    Clist.add(each);
                } else {
                    Flist.add(each);
                }
            }
            System.out.println(Alist.size());
            System.out.println(Alist);


        }
    }
}