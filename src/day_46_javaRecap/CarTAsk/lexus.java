package day_46_javaRecap.CarTAsk;

public class lexus extends  car{
    public lexus(String brand, String model, String color, int year, double price) {
        super("lexus", model, color, year, price);
    }


    @Override
    public void start() {
        System.out.println("starting"+" "+brand+" "+model);
    }
}
