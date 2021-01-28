package day_37CustomClass;

import java.time.LocalDate;

public class carObject {
    public static void main(String[] args) {

        car mercedes=new car();

        mercedes.SetInfo("mercedes","clk","red", LocalDate.of(2019,5,9),30000,1500);
        System.out.println(mercedes);



    }
}
