package day_12NestedIfs;

public class EligibleToVote {
    public static void main(String[] args) {

      String citizen="ok" ;
      int age=20;
      if (citizen=="usa"){
          if (age>=21){
              System.out.println("you are eligable");
          }else{
              System.out.println("you must be 21 years old");
          }

      }else{
          System.out.println("you must be citizen");
      }















    }
}
