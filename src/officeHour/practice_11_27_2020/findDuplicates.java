package officeHour.practice_11_27_2020;

import java.util.ArrayList;

public class findDuplicates {
    public static void main(String[] args) {

        char [] ch={'A','B','A','C','C','D','A'};//[A,A,C,C]
        ArrayList<Character>list=new ArrayList<>();

for (int i=0;i<=ch.length-1;i++) {
    int count = 0;
    for (char each : ch) {//findind frequency of one elemnt at a time
        if (each == ch[i]) {
            count++;
        }
    }
    if (count>1&&!list.contains(ch[i])){//to verify if the elemnnt is duplicated
        list.add(ch[i]);
    }
}
        System.out.println(list);
    }
}
