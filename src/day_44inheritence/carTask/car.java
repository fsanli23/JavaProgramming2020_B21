package day_44inheritence.carTask;

public class car {
    public String brand,model,color;
    public double price;
    public int year;

    public car(String brand, String model, String color, double price, int year) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.year = year;
    }

    public void start(){
        System.out.println("insert the key and twist ignition to start");
    }

    @Override
    public String toString() {
        return "car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", year=" + year +
                '}';
    }






}
