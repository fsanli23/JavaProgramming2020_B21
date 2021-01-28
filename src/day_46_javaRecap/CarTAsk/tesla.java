package day_46_javaRecap.CarTAsk;

public class tesla extends car {

    public tesla( String model, String color, int year, double price) {
        super("tesla", model, color, year, price);
    }


    public void start() {
        System.out.println("starting " + brand + " " + model);
    }


    public void autoPilot() {
        System.out.println("self driving " + brand + " " + model);
    }


}
