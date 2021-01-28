package day_40constructor;

public class Circle {
    public static double Pi;


    static {
        Pi = 3.14;
    }


    public double r, d, area, perimeter;


    public Circle(double r) {
        this.r = r;
        d = r * 2;
        area = r * r * Pi;
        perimeter = d * Pi;
    }

    class Circleobject{




    }


}
