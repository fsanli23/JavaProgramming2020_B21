package day_45Exception;

public class throwVersusTryCatch {
    public static void main(String[] args) {

        sleep(3);

    }







    public static void sleep(int  seconds){

        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



}
