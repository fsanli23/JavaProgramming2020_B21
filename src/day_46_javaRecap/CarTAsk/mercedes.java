package day_46_javaRecap.CarTAsk;

public class mercedes extends car{

    public mercedes( String model, String color, int year, double price) {
        super("mercedes", model, color, year, price);
    }
    @Override
    public void start(){
        System.out.println("starting"+brand+" "+" by pushing start button");
    }














}
