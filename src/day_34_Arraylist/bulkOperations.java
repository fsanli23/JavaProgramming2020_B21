package day_34_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class bulkOperations {
    public static void main(String[] args) {
//containsall

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        boolean r1 = list.contains(10);// verify if 10is contained in the list


        boolean r2 = list.contains(5) && list.contains(30) && list.contains(50) && list.contains(60);

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);

        boolean r3=list.containsAll(Arrays.asList(10,50,60,40,50));
        System.out.println( 3);






        char[] a={'a','b'};
        ArrayList<Character>o=new ArrayList<>(Arrays.asList('c','h'));

        ArrayList<String> employees=new ArrayList<>();

        employees.addAll(Arrays.asList("ahmed","ahmed","erjon","ahmed","adil","afrooz"));
       /* for (int i =0;i<= employees.size()-1;i++){
            if (employees.get(i).equals("ahmed")){
                employees.remove(i);
            }
        }*/
employees.removeAll(Arrays.asList("ahmed"));

        System.out.println(employees);
    }
}
