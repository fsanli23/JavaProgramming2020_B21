package day_36CustomClass;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class bankOfAmerica {
    public static void main(String[] args) {//bank of america Has en employee

        employee[] employees = {
                new employee(),
                new employee(),
                new employee(),
                new employee(),
                new employee()

        };

        DateTimeFormatter df=DateTimeFormatter.ofPattern("MMMM/dd/yyyy");

        employees[0].setInfo("angelina jole",'f',"developer","bankofameroca",10000,"45645dg", LocalDate.of(2020,2,25));













    }
}
