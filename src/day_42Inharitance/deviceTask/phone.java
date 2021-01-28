package day_42Inharitance.deviceTask;

public class phone extends device {

    public static boolean cancall, cansendmessage, hascamera;

    static {
        cancall = true;
        cansendmessage = true;
        hascamera = true;
    }

    public phone(String brand, String model, double price) {
        setinfo("phone", brand, model, price);
    }

    public void call(long numbeeer){
        System.out.println(brand+model+"is calling "+numbeeer);
    }

    public void text(long number){
        System.out.println(brand +"is texting"+number);
    }

}
