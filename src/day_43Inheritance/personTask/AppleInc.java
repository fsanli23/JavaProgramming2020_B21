package day_43Inheritance.personTask;

public class AppleInc {
    public static void main(String[] args) {

        tester tester1 = new tester("fatih", 35, 'm', 45, "sdet", "123654l");


        tester1.eat();
        tester1.sleep();
        tester1.work();
        System.out.println("salary" + tester1.calcsalary());
        tester1.testing();
        tester1.testing();
        System.out.println(tester1);
        developer developer1 = new developer("sanli", 23, 'm', 45, "sdet", "1226k");

        developer1.eat();
developer1.sleep();
developer1.work();
developer1.coding();
        System.out.println("salary"+developer1.calcsalary());
        System.out.println(developer1);

    }
}
