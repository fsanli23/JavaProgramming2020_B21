package day_40constructor;

import java.text.DecimalFormat;

public class SalaryCalculater {

    public static int numberOfWeek;

    public double  weeklyhour,hourlyRate, stateTaxRate, federalTaxTRate, salary, SalaryAfterTax, TotalTax;


    static {
        numberOfWeek = 52;

    }

     SalaryCalculater(double weeklyhour, double hourlyRate, double stateTaxRate, double federalTaxTRate) {



        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxTRate = federalTaxTRate;
        salary = weeklyhour * hourlyRate * numberOfWeek;
        TotalTax = (stateTaxRate + federalTaxTRate) * salary;
        SalaryAfterTax = salary - TotalTax;
    }


    public String toString() {
        DecimalFormat df=new DecimalFormat("0.00");
        return "SalaryCalculater{" +

                ", hourlyRate=$" + hourlyRate +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxTRate=" + federalTaxTRate +
                ", salary=" +df.format(salary)  +
                ", SalaryAfterTax=$" +df.format(SalaryAfterTax)  +
                ", TotalTax=$" + df.format(TotalTax) +
                '}';
    }
}
