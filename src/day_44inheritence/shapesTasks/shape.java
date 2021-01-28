package day_44inheritence.shapesTasks;

public class shape {
    public String name;
    public static  boolean isshape,hasArea,hasPerimeter;



    public void setinfo(String name){
        this.name=name;
    }
    static{
        isshape=true;
        hasArea=true;
        hasPerimeter=true;
    }

    public double calcArea(){
        return 0;
    }
    public double calccperimeter(){
        return 0;
    }

    @Override
    public String toString() {
        return "shape{" +
                "name='" + name + '\'' +"area '= "+calcArea()+"perimeter' = "+calccperimeter()+
                '}';
    }
}
