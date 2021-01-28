package day_30_ReturnMethods;

public class ReturMethod2 {
    public static void main(String[] args) {
        String names="racecar";


    }







  public static void reversestr1(String str) {
      String result="";
      for (int i=str.length()-1;i>=0;i--){
          result+=str.charAt(i);
      }
      System.out.println(result);

  }
public static String reversestr2(String str){
        String result="";
        for (int i=str.length()-1;i>=0;i--){
            result+=str.charAt(i);
        }
    System.out.println(result);
        return result;
}


}
