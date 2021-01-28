package day_16Scanner;

import java.util.Scanner;

public class browserType {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("pls enter your  browser");

        String browser=input.nextLine();

        input.close();
        switch (browser){
            case "chrome":
                System.out.println("chrome is opening");
                break;
            case "firefox":
                System.out.println("firefox is opening");
                break;
            case "opera":
                System.out.println("opera is opening");
                break;
            default:
                System.out.println(browser);
        }




    }
}
