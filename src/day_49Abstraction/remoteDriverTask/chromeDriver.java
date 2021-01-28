package day_49Abstraction.remoteDriverTask;

public class chromeDriver extends remoteDriver{
    @Override
    public void executeScript(String script) {
        System.out.println("script"+script+" is exxecuted on chrome");
    }

    @Override
    public void takeScreenShot(String name) {
        System.out.println("taking screen shot");
    }

    @Override
    public void get(String URL) {
        System.out.println("navigating to"+URL+"on chrome");
    }

    @Override
    public void close() {
        System.out.println("closing  chrome browser");
    }

    @Override
    public void quit() {
        System.out.println("quitting chrome");
    }
}
