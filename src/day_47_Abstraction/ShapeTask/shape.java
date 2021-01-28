package day_47_Abstraction.ShapeTask;

public abstract class shape {//not concrete

    public String name;


    public shape(String  name) {
        this.name=name;
    }

    public  abstract double area();
    public abstract double perimeter();


}
