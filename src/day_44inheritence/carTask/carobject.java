package day_44inheritence.carTask;

public class carobject {
    public static void main(String[] args) {

        Honda honda1 = new Honda("civic", "kki", "red", 20000, 1999);

        honda1.start();
        System.out.println(honda1);


        mercedes merdedces1 = new mercedes("e320", "red", 20000, 2005);


        merdedces1.start();
        System.out.println(merdedces1);

        jeep jeep1 = new jeep("choreke", "blue", 6000, 2004);

        jeep1.start();

        System.out.println(jeep1);


        tesla tesla1 = new tesla("modelx", "green", 40000, 2018);

        tesla1.start();
        System.out.println(tesla1);

    }
}
