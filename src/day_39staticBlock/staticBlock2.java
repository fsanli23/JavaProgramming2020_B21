package day_39staticBlock;

public class staticBlock2 {
    static {
        System.out.println("static block1");
    }

    static {
        System.out.println("static blok2");
    }

    static {
        System.out.println("static block3");
    }

    public static void main(String[] args) {
        System.out.println("maiin method");
    }
}
