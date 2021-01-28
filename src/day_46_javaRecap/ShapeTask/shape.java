package day_46_javaRecap.ShapeTask;

import day_46_javaRecap.CarTAsk.mercedes;

public class shape {


    public String name;


    public shape(String name) {
        if (name.isEmpty()) {
            throw new RuntimeException(" name can't be  empty");
        }
        for (int i = 0; i < name.length(); i++) {
            char eachchar = name.charAt(i);
            if (!Character.isLetter(eachchar)) {
                throw new RuntimeException("no such a shape");
            }
        }


        this.name = name;
    }

    public double area() {
        return 0;
    }

    public double perimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return "shape{" +
                "name='" + "+,area= "+area()+name + '\'' +
                '}';
    }
}
