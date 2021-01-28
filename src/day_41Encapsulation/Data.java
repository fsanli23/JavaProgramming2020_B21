package day_41Encapsulation;

public class Data {


    public static String publicvariable = "A";
    private static String privatevariable = "B";
    static String ddefaualt = "C";

    public Data() {

    }
    public static void publicmethod(){
        System.out.println("public method");
    }
static void defaultmethod(){
    System.out.println("default method");
}
}
