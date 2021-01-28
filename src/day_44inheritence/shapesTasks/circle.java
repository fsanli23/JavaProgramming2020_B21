package day_44inheritence.shapesTasks;

public class circle extends shape {

    public double radius,diameter;
    public  final static double Pi;

    static{
        Pi=3.14;
    }
    public circle(double radius){
        this.radius=radius;
        setinfo("circle");
        diameter=radius*2;
    }




}
