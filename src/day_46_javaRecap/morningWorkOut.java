package day_46_javaRecap;

public class morningWorkOut {
    public static void sleep(double seconds) {
        try {
            Thread.sleep((long) (seconds * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        sleep(3.5);
    }





}
