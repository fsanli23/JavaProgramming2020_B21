package day_45Exception.phoneTask;

public class device {
    public String brand,model;
    public   String country;
    public double price;

    public device(String brand,String model,String country,double price){
        this.country=country;
        this.brand=brand;
        this.model=model;
        this.price=price;

    }

    @Override
    public  String toString() {
        return "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", country='" + country + '\'' +
                ", price=" + price +
                '}';
    }
    //   creata a class called device:
    //                attributes: brand, model, price, country
    //                methods: toString












}
