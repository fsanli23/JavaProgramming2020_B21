package day_11MultiBranch;

public class LargestNumber {
    public static void main(String[] args) {
        int max;
     int n1=100;
     int n2=300;
     int n3=400;
     if (n1>n2&&n1>n3){
         max=n1;
     }else if (n2>n1&&n2>n3){
         max=n2;
     }else{max=n3;}

        System.out.println(max+" maximum number");








    }
}
