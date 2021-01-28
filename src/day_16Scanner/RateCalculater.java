package day_16Scanner;
import java.util.Scanner;
public class RateCalculater {
    public static void main(String[] args) {


Scanner input=new Scanner(System.in);
        System.out.println("enter your salary");

double salary=input.nextDouble();
        System.out.println("enter your hours per week");
        int hour=input.nextInt();
        double hourlyrate=salary/(hour*52);
        System.out.println("your hourly rate is " +hourlyrate);





    }
}
