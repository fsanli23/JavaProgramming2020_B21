package officeHour.practice_11_27_2020;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class combinenewarray {
    public static void main(String[] args) {
        char[] c1={'A','B','C','D','E'};
        char[] c2={'F','G','H','I'};
        ArrayList<Character>list=new ArrayList<>();
        for (char each:c1)list.add(each);

        for (char each:c2)list.add(each);

        System.out.println(list);

    }

}
