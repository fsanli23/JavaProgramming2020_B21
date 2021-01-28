package day_31MethodOverloading;

public class frequencyOfWord {
    public static void main(String[] args) {
        String str="java java java is great language";
        System.out.println(frequencyOfWord(str,"java"));



    }
/*
takes a sentence and return the ffrequencyof the word*/
    public static int frequencyOfWord(String sentence,String word){
        sentence=sentence.toLowerCase();
        word=word.toLowerCase();
        int frequency=0;
        while (sentence.contains(word)){
            sentence=sentence.replaceFirst(word,"");
                frequency++;
            }
        return frequency;
    }

























 /*1.  write a return method called frequencyOfWord that accepts two parameters: string str and String word, then returns the frequency of word
    Ex:
    str = "Java java java python python"
    word = "java";
    frequency(str, word) ==>  3
    Task2:
            1. create a method that can find the addition of two numbers
    method name: additionOf2Numbers
        2. create a method that can find the addition of three numbers
    method name: additionOf3Numbers
        3. create a method that can find the addition of four numbers
    method name: additionOf4Numbers*/

}
