package day_38_StaticKeyword;

public class salaryCalculator {
    /*
    2. Create a custom class called SalaryCalculator
                Attributes:
        hourlyRate, weeklyHours, stateTaxRate, federalTaxRate, salary, salaryAfterTax
        Methods:
        calculateSalary: returns the annual salary
        calculateStateTax: returns the total tax
        calculateFederalTax: returns the total tax
        calculateTotalTax: returns the total tax
        calculateSalaryAfterTax: returns the salary after calculator
        setInfo: accepts four arguments (hourlyRate, weeklyHours, stateTax, federalTax) and iitializes all instances
        toString() method
    */
    public double hourlyRate, weeklyHours, stateTaxRate, federalTaxRate, salary, salaryAfterTax;
    public void setInfo(double hourlyRate,double weeklyHours,double stateTaxRate,double federalTaxRate){

        this .hourlyRate=hourlyRate;
        this.weeklyHours=weeklyHours;
        this.stateTaxRate=stateTaxRate;
        this.federalTaxRate=federalTaxRate;
        salary=calculateSalary();
        salaryAfterTax=calculatesalaryAfterTax();


    }

    public double calculateSalary() {
        return hourlyRate * weeklyHours * 52;
    }

    public double calculateStateTax() {
        return calculateSalary() * stateTaxRate;
    }

    public double calculateFederaltax() {
        return salary * federalTaxRate;
    }

    public double calculateTotalTax() {
        return calculateStateTax() + calculateFederaltax();
    }

    public double calculatesalaryAfterTax() {
        return salary - calculateTotalTax();
    }


    public String toString() {
        return "salaryCalculator{" +
                "hourlyRate=" + hourlyRate +
                ", salary=" + salary +
                ", salaryAfterTax=" + salaryAfterTax +
                '}';
    }


    public boolean equals( salaryCalculator s1){
        return this.salary==s1.salary;
    }


}
