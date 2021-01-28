package officeHour.practice_12_2_2020;



import java.util.ArrayList;
import java.util.Arrays;

public class arrayllsitPractice2 {
    public static void main(String[] args) {

        ArrayList<Character>list=new ArrayList<>();
        list.addAll(Arrays.asList('A','B','C','D','A','A','B','G','*','&'));

        //remove all 'A' from array list
        list.removeAll(Arrays.asList('A'));
        System.out.println(list);
        // keep 'C' and 'B'
        list.retainAll(Arrays.asList('C','B'));
        System.out.println(list);
        ArrayList<Integer> numbers=new ArrayList<>();


        numbers.addAll(Arrays .asList(95,25,45,256,35,25,3,6,98,25,14));

        numbers.removeIf(p->p<75);
        System.out.println(numbers);






    }
}
