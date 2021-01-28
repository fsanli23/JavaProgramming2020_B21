package day_45Exception;

public class lunchBreakException  extends RuntimeException{

    public lunchBreakException(){
        super("it is lun");
    }

    public lunchBreakException(String msg){
        System.out.println("msg");
    }
    



}
class Test{
    public static void main(String[] args)  {


        throw new lunchBreakException("");


    }
}