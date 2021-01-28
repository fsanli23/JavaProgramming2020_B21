package day09ifstatement;

public class oddEven {
    public static void main(String[] args) {
        int number=201;
        boolean even=number%2==0;

        if (even){
            System.out.println(number+"is even number: ");
        }
       if (!even){
           System.out.println(number+"is odd number: ");
       }
    }
}
