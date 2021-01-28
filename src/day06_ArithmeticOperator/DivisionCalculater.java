package day06_ArithmeticOperator;

public class DivisionCalculater {
    public static void main(String[] args) {
        /*write a program that can calculate first number by second number, and print out the result
            num1 = 10;
            num2 = 3;
            output:10 divide by 3 is equal to 3 with a remainder of 1
            num1 = 20
            num2 = 6
            output:
                 20 divide by 6 is equal to 3 with a remainder of 2
            num1 = 100;
            num2 = 20;
            output:
                 100 divide by 20 is equal to 5 with a remainder of 0
*/

        int num1=10,num2=3;
        int result=num1/num2;
       int remainder=num1%num2;
       String finalResult=num1 +" divide by "+num2 +" is equal to "+result +" with a remainder of "+remainder+".";
        System.out.println(finalResult);
        int num4=100,num5=6;
        int result1=num4/num5;
        int remainder1=num4%num5;
        System.out.println(num4 +" divide by "+num5 +" is equal to "+result1 +" with a remainder of "+remainder1+".");

        int num6=100,num7=20;
        int result2=num6/num7;
        int remainder2=num6%num7;
        System.out.println(num6 +" divide by "+num7 +" is equal to "+result2 +" with a remainder of "+remainder2+".");
        System.out.println();

    }
}
