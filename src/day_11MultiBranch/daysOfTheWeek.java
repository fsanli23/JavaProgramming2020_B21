package day_11MultiBranch;

public class daysOfTheWeek {
    public static void main(String[] args) {
        int number = 1;
        String day;


        if (number == 1) {
            day = "monday";
        } else if (number == 2) {
            day = "tuesday";
        } else if (number == 3) {
            day = "wednesday";
        } else if (number == 4) {
            day = "thursday";
        } else if (number == 5) {
            day = "friday";
        } else if (number == 6) {
            day = "saturday";
        } else {
            day = "sunday";
        }

        System.out.println(day);


    }
}

