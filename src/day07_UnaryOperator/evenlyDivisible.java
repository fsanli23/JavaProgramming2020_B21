package day07_UnaryOperator;

public class evenlyDivisible {


    public static void main(String[] args) {

        int number =7;
        boolean remainderof1=number%2<1;
        boolean remainderof2=number%3<1;
        boolean remainderof3=number%4<1;
        System.out.println(number+"is divisible by 2: " +remainderof1);
        System.out.println(number+" is divisible by 3: "+remainderof2);
        System.out.println(number+"is divisible by 4: "+remainderof3);



    }
}
