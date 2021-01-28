package day_45Exception;

public class driver {
    public static void main(String[] args) {
        String browserName = "CyberTek";
        switch (browserName.toLowerCase()) {
            case "chrome":
                System.out.println("chrome selected");
                break;
            case "firefox":
                System.out.println("firefox selected");
                break;

            case "safari":
                System.out.println("safari selected");
                break;
            default:
                throw new RuntimeException("no such a browser Name" + browserName);
        }











    }
}
