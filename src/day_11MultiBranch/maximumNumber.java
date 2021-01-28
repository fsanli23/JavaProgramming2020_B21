package day_11MultiBranch;

public class maximumNumber {
    public static void main(String[] args) {
      int number1=5;
        int number2=10;
        int maxno;int minno;
        if (number1>number2){
            maxno=number1;
        }else{
            maxno=number2;}

        maxno=(number1>number2)?number1:number2;

        System.out.println(maxno);

        System.out.println(("================================================="));

        if(number1<number2){
            minno=number1;
        }else {
            minno=number1;
        }

        minno=(number1<number2)?number1:number2;

        System.out.println(minno);

        System.out.println("=========================================================");




    }
}
