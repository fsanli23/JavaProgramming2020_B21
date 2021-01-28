package day10_ifElseStatement;

public class maximumNumber {
    public static void main(String[] args) {

     int n1=100;
     int n2=200;
     int n3=300;

     boolean n1ismax =n1> n2 && n1> n3;
     boolean n2max=!n1ismax && n2>n3;
      boolean n3ismax=  !n1ismax&!n2max;
String str="is maximum number";
       if (n1ismax){
           System.out.println(n1+ str);
       }
        if (n2max){
            System.out.println(n2+str);
        }

        if (n3ismax){
            System.out.println(n3+str);
        }


    }
}
