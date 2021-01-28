package day_44inheritence.webdrivertask;

public class fireFoxDriver extends weddriver{

    public fireFoxDriver() {
        super("fireFox Browser","v83.0.0");
    }

    @Override
    public void get(String URl) {
        System.out.println("opening the "+URl+"from firefox driver");
    }

    @Override
    public void close() {
        System.out.println("closing firefox browser");
    }

    @Override
    public void maximize() {
        System.out.println("maximizing firefox browser");
    }
}
