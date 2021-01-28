package day_13_SwitchStatement;

public class daysInMonths {
    public static void main(String[] args) {

        int year = 2000;
        int month = 2; // 1 ~ 12

        boolean has30Days = month == 4 || month == 6 || month == 9 || month == 11;
        //   boolean has31Days = !has28Or29Days || !has30Days;

        String result = "";
   if (month>0&&month<13){
       if (month==2){
           if (year%4==0){
               result="28days";
           }else {
               result="29";
           }

       }else if (has30Days){
           result="30";
       }else{
           result="31";
       }


   }else{
       result="invld";
   }


        System.out.println(result);







    }
}
