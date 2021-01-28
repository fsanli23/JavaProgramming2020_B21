package day_44inheritence.carTask;

public class tesla  extends car{
    public tesla( String model, String color, double price, int year) {
        super("tesla", model, color, price, year);
    }

    @Override
    public void start() {
        System.out.println("say /'starr/'");
    }
}
