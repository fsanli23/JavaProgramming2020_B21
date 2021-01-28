package day_45Exception.phoneTask;

public class finallyBlock {
    public static void main(String[] args) {

        try {
            System.out.println("hello world");
        } catch (RuntimeException e) {
            System.out.println("catch block");
        } finally {
            System.out.println("closed");
        }

        System.out.println("test completed");


    }
}
