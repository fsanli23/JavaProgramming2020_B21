package day_34_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class simpleLambdaExpression {
    public static void main(String[] args) {

        ArrayList<Integer>  numbers=new ArrayList<>();

        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
       /* for (int i=0;i<=numbers.size()-1;i++){
            if (numbers.get(i)<5){
                numbers.remove(i);*/

        //removeif()
        Predicate<Integer> lessthan5=p->p<=5;
numbers.removeIf(lessthan5);

        System.out.println(numbers);

        System.out.println("================================");



    }
}
