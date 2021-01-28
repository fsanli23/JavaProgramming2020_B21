package day_50Polymorphism.phoneTask;

public  final class samsung extends phone implements downloadable{
    @Override
    public void downloadApp() {

    }

    @Override
    public void text() {

    }

    @Override
    public void call() {

    }

    public samsung( String model, String size, String color, double price) {
        super("samsung", model, size, color, price);
        if (price>1200)
            throw  new RuntimeException("innvalid price");
    }
}
