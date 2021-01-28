package day_49Abstraction.ShapeTask;

public class Circle  extends shape{

public double r;
public final static double PI=3.14;
public double d;


    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }

    public Circle(double r) {
        super("Circle");
        this.r=r;
        d=r*2;

    }
}
