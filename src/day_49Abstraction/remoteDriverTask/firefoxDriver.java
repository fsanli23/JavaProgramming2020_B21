package day_49Abstraction.remoteDriverTask;

public class firefoxDriver extends remoteDriver{
    @Override
    public void executeScript(String script) {
        System.out.println("script"+script+" is exxecuted on firefox");
    }

    @Override
    public void takeScreenShot(String name) {
        System.out.println("taking screen shot");

    }

    @Override
    public void get(String URL) {
        System.out.println("navigating to"+URL+"on firefox");

    }

    @Override
    public void close() {
        System.out.println("closing  firefox browser");

    }

    @Override
    public void quit() {
        System.out.println("quitting firefox");

    }
}
