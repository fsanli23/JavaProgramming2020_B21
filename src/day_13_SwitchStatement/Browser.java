package day_13_SwitchStatement;

public class Browser {
    public static void main(String[] args) {
        String browser = "chrome";
        boolean valid = browser == "chrome" || browser == "firefox" || browser == "opera" || browser == "edge" ||
                browser == "safari" || browser == "edge";

        if (valid) {
            if (browser == "chrome") {
                System.out.println("selected browser= chrome");
            } else if (browser == "firefox") {

            }


        } else {
            System.out.println("no such a browser");
        }


    }
}
