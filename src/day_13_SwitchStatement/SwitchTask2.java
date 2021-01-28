package day_13_SwitchStatement;

import javax.rmi.CORBA.StubDelegate;

public class SwitchTask2 {
    public static void main(String[] args) {
        /*2. write a program that can print the name of the month based on the number.
        if numbers is greater than 12 or less than 1, print invalid
        MUST use switch*/
        String nameofmonths;
        int month = 5;
        switch (month) {
            case 1:
                nameofmonths = "jan";
                break;
            case 2:
                nameofmonths = "feb";
                break;
            case 3:
                nameofmonths = "march";
                break;

            case 4:
                nameofmonths = "april";
                break;

            case 5:
                nameofmonths = "may";
                break;

            case 6:
                nameofmonths = "jun";
                break;

            case 7:
                nameofmonths = "july";
                break;
            case 8:
                nameofmonths = "agust";
                break;
            case 9:
                nameofmonths = "sep";
                break;
            case 10:
                nameofmonths = "oct";
                break;
            case 11:
                nameofmonths = "nov";
                break;
            case 12:
                nameofmonths = "dec";
                break;

            default:
                nameofmonths = "invalid";


        }


        System.out.println(nameofmonths);

        System.out.println(3+5+ month);

    }

}
