package day_16Scanner;

import java.util.Scanner;

public class calculater {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter numb1");
        double numb1= input.nextDouble();
        System.out.println("enter number 2");
        double num2= input.nextDouble();
        System.out.println("enter operator");
        String operator= input.next();
        input.close();
        double result=0;
        boolean isvalid=true;
        switch (operator){
            case"+":
                result=num2+numb1;
                break;
            case "-":
                result=numb1-num2;
                break;
            case"*":
                result=num2*numb1;
                break;

            case"/":
                result=numb1/num2;
                break;
            case"%":
                result=numb1%num2;
                break;
            default:
                System.out.println("not valid");
isvalid=false;
break;
        }if (isvalid){
            System.out.println(result);}
        else{

        System.out.println("try again");}

    }
}
