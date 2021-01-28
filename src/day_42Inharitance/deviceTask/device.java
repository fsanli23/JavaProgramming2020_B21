package day_42Inharitance.deviceTask;

public class device {


    public String deviceName, brand, model;
    public double price;

    public static String madeIn;
    public static boolean hasBattery;
    public static boolean hasPowerButton;


    static {
        madeIn = "china";
        hasBattery = true;
        hasPowerButton = true;
    }

    public void setinfo(String deviceName, String brand, String model, double price) {
        this.deviceName = deviceName;
        this.brand = brand;
        this.model = model;
        this.price = price;
    }


    public String toString() {
        return "device{" +
                "deviceName='" + deviceName + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price= $" + price +
                '}';
    }

    public void turnon(){
        System.out.println("turning on"+brand+" "+model);
    }

    public  void turnoff(){
        System.out.println("turning off "+ brand+" "+model);
    }




}
