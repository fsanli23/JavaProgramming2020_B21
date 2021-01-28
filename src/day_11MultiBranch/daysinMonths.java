package day_11MultiBranch;

public class daysinMonths {
    public static void main(String[] args) {
      /*  Warmup tasks: DaysInMonth
        1. write a program that can find the number of days in a month
                (Assume that Feb has 28 days)
        Ex:
        month = 2

        output:
        28 days


                month = 9

        output:
        30 days

        Hints: it cannot be done with if&else statement, you will need single if statements

        28 days: 2
        30 days: 4, 6, 9, 11
        31 days: 1, 3, 5, 7,8,10*/
        int month = 3;
        boolean hasdays28 = month == 2;
        boolean has30days = month == 4 || month == 6 || month == 9 || month == 11;
        boolean has31days = !hasdays28 && !has30days;
        int days = 7;
        if (hasdays28) {
            days = 28;
        }
        if (has30days) {
            days = 30;
        }
        if (has31days) {
            days = 31;
        }

        System.out.println(days + "days");

    }
}
