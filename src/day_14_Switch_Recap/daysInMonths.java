package day_14_Switch_Recap;

public class daysInMonths {
    public static void main(String[] args) {

int year=2020;
String month="jan";

String result="";
 switch (month){
     case "jan":result="31days";
     break;
     case"feb":result=(year%4==0)?"29days":"28days";
     break;
     case "march":result="31days";
     break;
     case "april":result="30days";
     break;
     case "may":result="31days";
     break;
     case "june ":result="30days";
     break;
     case "july" :result="31days";
     break;
     case "agust": result="30 days";
     break;
     case "sept":result="30days";
     break;
     case"oct":result="30days";
     break;
     case "nov":result="31days";
     break;
     case "dec":result="30days";
     default: result="invalid";

 }






    }
}
