package day_49Abstraction.ShapeTask;

public abstract class shape {

    public final String name;

    public shape(String name) {
        this.name = name;
    }

    public abstract double area();

    public abstract double perimeter();

    @Override
    public String toString() {
        return "shape{" +
                "name='" + name + '\'' +
                '}';
    }
}
