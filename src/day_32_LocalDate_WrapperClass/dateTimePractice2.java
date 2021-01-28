package day_32_LocalDate_WrapperClass;

import java.time.LocalDate;

public class dateTimePractice2 {
    public static void main(String[] args) {

        LocalDate dofb= LocalDate.of(1984,5,1) ;


        //10 years ago
        int age1=LocalDate.now().minusYears(10).getYear()-dofb.getYear();

        System.out.println(age1);







    }
}
