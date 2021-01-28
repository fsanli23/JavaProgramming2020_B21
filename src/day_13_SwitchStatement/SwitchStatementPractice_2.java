package day_13_SwitchStatement;

public class SwitchStatementPractice_2 {
    public static void main(String[] args) {
        int n = 5;
        String day = "";
        switch (n) {
            case 1:
                day = "monday";
                break;
            case 2:
                day = "tuesday";
                break;
            case 3:
                day = "wed";
                break;
            case 4:
                day = "thurs";
                break;
            case 5:
                day = "friday";
                break;
            case 6:
                day = "satur";
                break;
            case 7:
                day = "sunday";
                break;
            default:
                System.out.println("invalid");
                break;// it doesnt have to be a break since it is last column.


        }


    }
}
