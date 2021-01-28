package day_47_Abstraction.ShapeTask;

public class rectangle extends shape{

    public double width,length;

    public rectangle(String name, double width, double length) {
        super(name);
        this.width = width;
        this.length = length;
    }


    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }
}
