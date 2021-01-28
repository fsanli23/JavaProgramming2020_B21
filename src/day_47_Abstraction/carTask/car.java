package day_47_Abstraction.carTask;

public abstract class car {
    public String brand,model,color;
    public int year;
    public double price;


    public car(String brand, String model, String color, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
    }

    public abstract void start();


    @Override
    public String toString() {
        return "car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
