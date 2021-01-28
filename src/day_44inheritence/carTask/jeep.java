package day_44inheritence.carTask;

public class jeep extends car{
    public jeep( String model, String color, double price, int year) {
        super("jeep", model, color, price, year);
    }

    @Override
    public void start() {
        System.out.println("call mechanic,oil change");
    }
}
