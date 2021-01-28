package day_44inheritence.webdrivertask;

public class chromeDriver extends weddriver {

    public chromeDriver(String name, String version) {
        super("chrome browser", "v84.0.1");
    }

    @Override
    public void get(String URl) {
        System.out.println("opening the chrome");
    }

    @Override
    public void close() {
        System.out.println("closing the chrome driver");    }

    @Override
    public void maximize() {
        System.out.println("maximizing chrome driver");    }
}
