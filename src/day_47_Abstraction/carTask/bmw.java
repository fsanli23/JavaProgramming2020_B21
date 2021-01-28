package day_47_Abstraction.carTask;

public class bmw extends  car{
    public bmw( String model, String color, int year, double price) {
        super("bmw", model, color, year, price);
    }


    @Override
    public void start() {
        System.out.println("call mechanic:oil change");
    }
}
