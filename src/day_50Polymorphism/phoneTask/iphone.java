package day_50Polymorphism.phoneTask;

public  final class iphone extends phone implements AppleApple{

    public iphone( String model, String size, String color, double price) {
        super("Apple ", model, size, color, price);
        if (price>1500){
            throw  new RuntimeException("invalid price");
        }


    }

    @Override
    public void text() {

    }

    @Override
    public void call() {

    }

    @Override
    public void downloadApp() {
        System.out.println("downloading app from +"+ AppstoreNAme);
    }











}
