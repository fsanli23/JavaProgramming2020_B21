package day_14_Switch_Recap;

public class daysInAMonth2 {
    public static void main(String[] args) {
        int year=2020;
        String month="jan";
        String result="";

        switch (month){
            case "feb":result=(year%4==0)?"29":"29";
            break;
            case"apr":
            case"june":
            case"sep":
            case"nov":
                result="30days";break;
            case "jan":
        }




    }
}
