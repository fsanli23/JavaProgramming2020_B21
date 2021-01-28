package day_37CustomClass;

import java.time.LocalDate;

public class car {

    public String brand, model, color;
    public LocalDate Dob;//2019-7-7
    public double price, milage;
    public  int year;

    public void SetInfo(String brand, String model, String color, LocalDate dob, double price, double milage) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        Dob = dob;
        this.price = price;
        this.milage = milage;
        this.year=dob.getYear();
    }


    public String toString() {
        return "car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", Dob=" + Dob +
                ", price=" + price +
                ", milage=" + milage +
                ", year=" + year +
                '}';
    }

}




/*
radius
pi
diameter
area
perimamater

 */