package day_32_LocalDate_WrapperClass;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
public class time {
    public static void main(String[] args) {


        LocalTime t1=LocalTime.of(23,59,59);
        System.out.println(t1);

LocalTime now=LocalTime.now();
        System.out.println(now);


        System.out.println("=======================================");

        LocalDateTime t2= LocalDateTime.of(2020,11,23,11,53,25,0036);

        System.out.println(t2);







    }
}
