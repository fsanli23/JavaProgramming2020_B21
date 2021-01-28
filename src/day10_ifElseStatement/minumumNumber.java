package day10_ifElseStatement;

public class minumumNumber {
    public static void main(String[] args) {
     int n1=200;
     int n2=100;
     int n3=300;
     boolean n3ismin=n3<n1&&n3<n2;
     boolean n2ismin=!n3ismin&&n2<n1;
     boolean n1ismin=!n2ismin&&!n3ismin;
     String str=" is minumum";
     if (n3ismin){
         System.out.println(n3+str);
     }

        if (n2ismin){
            System.out.println(n2+str);
        }
      if (n1ismin){
          System.out.println(n1+str);
      }
    }
}
