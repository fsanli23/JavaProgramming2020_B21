package officeHour.practice_11_27_2020;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        //str1=silent;
       // str2=listen;

        String str1="listen";
        String str2="silent";


str1= str1.toUpperCase();
str2=str2.toUpperCase();
str1=sort(str1);
str2=sort(str2);
        System.out.println(str1.equals(str2));

    }
    public static String sort(String str){
        String result="";
        char [] ch=str.toCharArray();
        Arrays.sort(ch);
        for (char each:ch)result+=each;

        return result;
    }


}
