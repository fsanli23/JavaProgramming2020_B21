package day_45Exception.phoneTask;

public class execptionHandling {
    public static void main(String[] args) {

        //Stringindexoutofbond

        String str = "CyberTek";


        try {


            System.out.println(str.substring(1,3));

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }


        System.out.println("test completed");


    }
}
