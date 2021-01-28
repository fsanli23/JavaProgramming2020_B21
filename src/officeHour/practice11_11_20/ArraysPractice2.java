package officeHour.practice11_11_20;

public class ArraysPractice2 {
    public static void main(String[] args) {

        String [] word={"anna","lol","level","donald","biden","agalar","engin"};

int count=0;

       for (String each:word){
           char first=each.toLowerCase().charAt(0);
           char last=each.toLowerCase().charAt(each.length()-1);
           if ((first==last)){
               count++;
               System.out.println(each);
           }
       }

        System.out.println(count);





    }
}
