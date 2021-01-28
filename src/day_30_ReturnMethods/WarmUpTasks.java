package day_30_ReturnMethods;

public class WarmUpTasks {
    public static void main(String[] args) {
        positivenegativezero(1);
        int [] no={1,2,3,4,-5,-8,-9,-6-14};
        for (int each :no) {
             positivenegativezero(each);

        }
    }

public static void positivenegativezero(int number){
    String result=(number>0)?"positive":(number<0)?"negative":"zero";
    System.out.println(result);
    }


}
