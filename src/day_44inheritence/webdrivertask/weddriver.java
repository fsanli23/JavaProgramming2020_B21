package day_44inheritence.webdrivertask;

public class weddriver {

    public String name, version;

    public weddriver(String name, String version) {

    }

    public void get(String URl) {
        System.out.println("opening the default driver");
    }

    public void close() {
        System.out.println("closing the Remote driver ");
    }


    public void maximize() {
        System.out.println("maximizing the Remote driver");
    }

    @Override
    public String toString() {
        return "remoteDriver{" +
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                '}';
    }

}
