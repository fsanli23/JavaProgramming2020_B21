package day_23NestedLoop;

public class FrequencyOfWord {
    public static void main(String[] args) {
        String sentence="java is a programming language,i like to learn java";
        String word="java";
        int count=0;
        while(sentence.contains(word)){
            sentence=sentence.replaceFirst(word,"");// wee need to remove at a time to coint
            count++;

        }
        System.out.println("count = " + count);




    }
}
