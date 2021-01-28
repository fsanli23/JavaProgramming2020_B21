package day_47_Abstraction.carTask;

public class tesla extends car{

    public tesla( String model, String color, int year, double price) {
        super("tesla", model, color, year, price);
    }

    @Override
    public void start(){
        System.out.println("voice control:say start");
    }




}
