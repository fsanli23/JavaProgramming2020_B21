package day_49Abstraction.remoteDriverTask;





public class testCases {
    public static void main(String[] args) {

        chromeDriver driver = new chromeDriver();
        driver.get("https://www.google.com");
        driver.close();
        System.out.println("-----------------------------------------------------");
        firefoxDriver driver2 = new firefoxDriver();
        driver2.get("https://www.google.com");
        driver2.close();


    }


}
