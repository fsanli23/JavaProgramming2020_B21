package day_33ArrayList;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class daytimePractice {
    public static void main(String[] args) {

       /* up tasks:
        1. use the LocalDate & Time get the date and time in the following format:
        Tuesday, 1:00 pm, Nov/24/2020
        2. create an array of LocalDate and store the next 10 day's dates, use for each loop to print each Date in the following formar:
        MonthName/Day, Name
        ex:
        November/25, Wednesday
        3.create an array of string and store 5 of your friends names
        create an array of local date and store their
*/

LocalDateTime day1=LocalDateTime.of(2020,11,24,13,0);
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("EEEE,h:mm a, MMM/dd/yyyy");
        System.out.println(day1.format(dtf));

        System.out.println("============================");
        DateTimeFormatter df=DateTimeFormatter.ofPattern("MMM/dd,E");
        LocalDate[] days=new LocalDate[10];
        for (int i=0;i<=days.length-1;i++){
            days[i]=LocalDate.now().plusDays(i);

        }
        System.out.println(Arrays.toString(days));

        for (LocalDate each:days){
            System.out.println(each.format(df));
        }
        System.out.println("=================================================");











    }
}
