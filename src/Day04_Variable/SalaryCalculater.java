package Day04_Variable;

public class SalaryCalculater {


    public static void main(String[] args) {

/*
write a program that can calculate the salary after tax based on the salary and tax rate
            Ex:
                if salary = 100000
                   taxRate = 0.28
                   totalTax = salary * taxRate;
                   salary after tax = salary - totalTax

 */

        int salary=10000;
        double taxRate=0.28;
      double  totaltax=salary*taxRate;
       double salaryAterTax=salary-totaltax;

        System.out.println(totaltax);
        System.out.println(salaryAterTax);


    }
}

