package day_43Inheritance.carTask;

public class car {
    public    String brand,model,color,madein;
    public double miles,price;

    public  int year;
    public static  boolean hasEngine,haswheel,hastires;



    static {
        hasEngine=true;
        haswheel=true;
        hastires=true;
    }

    public void setinfo(String brand, String model, String color, String madein, double miles, double price, int year) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.madein = madein;
        this.miles = miles;
        this.price = price;
        this.year = year;
    }

    public void drive(){
        System.out.println("driving"+brand+" "+model);
    }


    public  void park(){
        System.out.println("parking"+brand+" "+model);
    }

    public  String toString(){
        return year+" "+brand+""+color+" "+miles+" miles, $"+price;
    }





}
