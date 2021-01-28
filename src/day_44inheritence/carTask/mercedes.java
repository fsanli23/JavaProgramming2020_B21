package day_44inheritence.carTask;

public class mercedes extends car {
    public mercedes( String model, String color, double price, int year) {
        super("mercedes", model, color, price, year);
    }

    @Override
    public void start() {
        System.out.println("push start button");
    }
}
