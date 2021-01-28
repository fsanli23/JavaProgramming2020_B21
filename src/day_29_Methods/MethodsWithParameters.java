package day_29_Methods;

public class MethodsWithParameters {
    public static void main(String[] args) {
  eligibleToBuyalcohol(25);
calculateAge(1984,2020);

    }
  public static void eligibleToBuyalcohol(int age) {
        if (age>=21){
            System.out.println("eligible");
        }else {
            System.out.println("not eligible");}
  }
  public static void calculateAge(int birthyear,int currentyear){
      System.out.println("your age is "+(currentyear-birthyear));
  }
}
