package day_11MultiBranch;

public class daysInMonths2 {
    public static void main(String[] args) {
        int days;
        int month = 4;
        boolean hasdays28 = month == 2;
        boolean has30days = month == 4 || month == 6 || month == 9 || month == 11;
        boolean has31days = !hasdays28 && !has30days;

        if (hasdays28) {
            days = 28;
        } else if (has30days) {
            days = 30;
        } else {
            days = 31;
        }
        System.out.println(days);


    }
}
