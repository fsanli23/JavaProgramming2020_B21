package officeHour.practice_11_26_2020;

public class Arraypractice2 {
    public static void main(String[] args) {



        String sentence="Today is a great day to celebrate the thanksgiving by doing java task";

       String[] str=sentence.split(" ");
       String reverse="";
       for (int i=str.length-1;i>=0;i--) {
           reverse += str[i] + " ";

           System.out.println(reverse);


       }


    }
}
