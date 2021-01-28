package day_38_StaticKeyword;

public class iphone {

    public String model, color, storage;
    public double price;
    public static String brand = "Apple", madIn = "china";
    public static String Os = "ois";

    public void call(long phoneNumber) {
        System.out.println("iphone " + model + "is calling" + phoneNumber);
    }

    public static void  getIphoneInfo( ){
        System.out.println("brand"+brand);
        System.out.println("operating system"+Os);
        System.out.println("made in "+madIn);
    }




    public  String toString() {
        return "iphone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", storage='" + storage + '\'' +
                ", price=" + price +
                '}';
    }
}
