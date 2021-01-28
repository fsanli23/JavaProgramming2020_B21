package day_38_StaticKeyword;

public class salaryCalculatorObject {


    public static void main(String[] args) {

        salaryCalculator obj1 = new salaryCalculator();
        obj1.setInfo(55, 40, 0.08, 0.22);


        System.out.println(obj1);

        salaryCalculator obj2 = new salaryCalculator();

        obj2.setInfo(55, 40, 0.08, 0.22);

        System.out.println(obj2);


    }
}
