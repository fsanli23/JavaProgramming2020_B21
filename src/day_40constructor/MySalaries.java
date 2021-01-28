package day_40constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class MySalaries {
    public static void main(String[] args) {


        SalaryCalculater salary1 = new SalaryCalculater(40, 55, 0.9, 0.20);

        System.out.println(salary1);

        SalaryCalculater salary2 = new SalaryCalculater(40, 55, 9, .20);

        SalaryCalculater salary3 = new SalaryCalculater(40, 35, 0.25, 0.09);

        SalaryCalculater salary4 = new SalaryCalculater(40, 52, 0.25, 0.09);

        SalaryCalculater salary5 = new SalaryCalculater(40, 20, 0.25, 0.09);

        ArrayList<SalaryCalculater> salaries = new ArrayList<>();
        salaries.addAll(Arrays.asList(salary1, salary2, salary3, salary4, salary5));
        double maxsalaryAfterTax = salaries.get(0).SalaryAfterTax;
        double minsalaryAfterTax = salaries.get(0).SalaryAfterTax;

        double maxtotoalTax = salaries.get(0).TotalTax;
        double mintotalTax = salaries.get(0).TotalTax;

        for (SalaryCalculater each : salaries) {
            maxsalaryAfterTax = Math.max(each.SalaryAfterTax, maxsalaryAfterTax);
            minsalaryAfterTax = Math.min(each.SalaryAfterTax, minsalaryAfterTax);

            mintotalTax = Math.min(each.TotalTax, mintotalTax);
            maxtotoalTax = Math.max(each.TotalTax, maxtotoalTax);

        }


    }
}
