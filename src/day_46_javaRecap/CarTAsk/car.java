package day_46_javaRecap.CarTAsk;

import java.time.LocalDate;
import java.util.InputMismatchException;

public class car {
    public static int numberOfTires;
    public String brand, model, color;
    public static boolean hasEngine, hasSeat;

    static {
        hasEngine = true;
        hasSeat = true;
        numberOfTires = 4;
    }

    public int year;
    public double price;

    public car(String brand, String model, String color, int year, double price) {

        if (year > LocalDate.now().getYear()+1 || year < 0) {
            throw new InputMismatchException("invalid year"+year);
        }
if (price<=0){
    throw new RuntimeException("car price cant be negative or zero"+price);
}

        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
    }

    @Override
    public String toString() {
        return "car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price= $ " + price +
                '}';
    }
    public void start(){

    }

    public final void drive(){
        System.out.println("driving"+brand+" "+model);
    }
}
