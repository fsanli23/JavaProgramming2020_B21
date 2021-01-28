package day_32_LocalDate_WrapperClass;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class timeFormatter {
    public static void main(String[] args) {
        DateTimeFormatter df=DateTimeFormatter.ofPattern("MMMM/dd/yyyy EEEE");

        LocalDate today=LocalDate.now();
        System.out.println(today);
        System.out.println(today.format(df));
DateTimeFormatter dtf=DateTimeFormatter.ofPattern("E, hh:mm a,MMMM/dd/yyyy");
LocalDateTime dt1=LocalDateTime.of(2020,11,23,12,40);

        System.out.println(dt1.format(dtf));


        System.out.println("+++++++++++++++++++");






    }
}
