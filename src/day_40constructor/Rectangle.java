package day_40constructor;

public class Rectangle {


    public static int numberOfSides;


    public double width, length, area, peremiter;

    static {
        numberOfSides = 4;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
        area = width * length;
        peremiter = (width + length);
    }


    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", area=" + area +
                ", peremiter=" + peremiter +
                "number of size" + numberOfSides + '}';
    }
}

class RectangleObject {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(3, 5);
        System.out.println(rectangle1);
    }


}
