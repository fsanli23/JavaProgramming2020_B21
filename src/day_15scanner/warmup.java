package day_15scanner;

public class warmup {
    public static void main(String[] args) {
        int numberofpeop = 50;
        int crew = 0;
        int passenger = 0;

        switch (numberofpeop) {
            case 50:
                crew = 20;
                passenger = 30;
                break;
            case 75:
                crew = 25;
                passenger = 50;
                break;

            case 100:
                crew = 30;
                passenger = 70;
                break;
            default:
                System.out.println("invalid number of people");

        }


        


    }

}
