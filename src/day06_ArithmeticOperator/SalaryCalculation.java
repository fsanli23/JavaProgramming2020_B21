package day06_ArithmeticOperator;

public class SalaryCalculation {
    public static void main(String[] args) {

        double salary=100000;
        double stateTaxRate=0.08;
        double federalTaxRate=0.21;

       double stateTax=salary*stateTaxRate;
        double federalTax=salary*federalTaxRate;
        double totalTax=stateTax+federalTax;

        double salaryAfterTax=salary-totalTax;
        System.out.println("your salary is: $ "+salary );
        System.out.println("state tax is :$ "+ stateTax);
        System.out.println("federal tax is: $ " +federalTax);
        System.out.println("your total tax is :$ " +totalTax);
        System.out.println("salary  after tax: $ "+ salaryAfterTax);






    }
}
