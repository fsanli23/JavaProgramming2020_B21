package day_47_Abstraction.ShapeTask;

public  class circle  extends shape{
    public double radius;
    public final  static  double PI=3.14;


    public circle(String name, double radius) {
        super("circle");
        this.radius = radius;
    }

    public  double area(){
        return  radius*radius*PI;
    }


    public double perimeter() {
        return 2*radius*PI;
    }
}
