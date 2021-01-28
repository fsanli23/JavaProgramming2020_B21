package day_50Polymorphism.phoneTask;

public  abstract class phone {

   public String brand, model,size,color;
   public   double price;

    public phone(String brand, String model, String size, String color, double price) {
        if (price<0){
            throw new RuntimeException("invalid price,cant be negative");
        }
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.color = color;
        this.price = price;
    }


    public abstract void text();



    public abstract void call();

    @Override
    public String toString() {
        return "phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
