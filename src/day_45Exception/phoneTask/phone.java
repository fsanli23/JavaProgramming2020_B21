package day_45Exception.phoneTask;

public class phone extends device {
    //create a class called phone:
    //                attributes: brand, model, price, country
    //                methods: call, text,  toString


    public phone(String brand, String model, String country, double price) {
        super(brand, model, country, price);
    }


    public String toString(){
        return"phone"+super.toString();
    }
















}
