package day_26array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {

String sentence ="today is monday";
  String [] word=sentence.split(" ");
        System.out.println(Arrays.toString(word));

        String reveredSentenced="";
    for (int i=word.length-1;i<=0;i--){
        reveredSentenced+=word[i]+"'";
    }

reveredSentenced=reveredSentenced.trim();
        System.out.println(reveredSentenced);




    }
}
