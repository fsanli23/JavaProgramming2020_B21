package day_13_SwitchStatement;

public class switchStatement_Practice1 {
    public static void main(String[] args) {
String day="";
        switch (5) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wed");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("invalid");
                break;// it doesnt have to be a break since it is last column.


        }


    }
}
