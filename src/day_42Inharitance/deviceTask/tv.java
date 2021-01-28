package day_42Inharitance.deviceTask;

public class tv extends  device{
    public tv( String brand,String model,double price){
        setinfo("tv",brand,model,price);
    }



   public static  boolean haschannel;
    public  static  boolean hascable;
    static {
        haschannel=true;
        hascable=true;
    }
    public void cahnnelup(){
        System.out.println("cahannel up"+brand+model);
    }











}
