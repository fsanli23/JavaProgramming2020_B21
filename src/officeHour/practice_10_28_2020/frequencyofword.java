package officeHour.practice_10_28_2020;

public class frequencyofword {
    public static void main(String[] args) {

    String sentence="cat cat cat cat cat cat";
    String word="cat";
    int count=0;


    while(sentence.contains(word)){
      sentence=  sentence.replaceFirst(word,"oo");
        count++;
    }

        System.out.println("count = " + count);








    }
}
