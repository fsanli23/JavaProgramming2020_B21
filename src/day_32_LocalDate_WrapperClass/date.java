package day_32_LocalDate_WrapperClass;
import java.time.LocalDate;
public class date {
    public static void main(String[] args) {

       LocalDate yesterday=LocalDate.of(2020,11,22) ;
        System.out.println(yesterday);

        LocalDate today=LocalDate.now();
        //localdate dofb
        LocalDate birthday=LocalDate.of(1984,05,1);
        System.out.println(birthday);

String[] names={"fatih","resul","serap","mehtap","vahap"};
LocalDate[] birthdays={LocalDate.of(1945,2,8),
        LocalDate.of(2020,05,2),
        LocalDate.of(1984,3,6),
        LocalDate.of(2018,2,9),
        LocalDate.of(2000,8,25)};


for (int i=0;i<=names.length-1;i++){
    System.out.println(names[i]+"' birthday is "+birthdays[i]);
    System.out.println(names[i]+"wasborn on leap year");
}









    }
}
