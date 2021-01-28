package day_38_StaticKeyword;

import day_26array.ArrayUtility;
import library.StringUtility;

import java.text.DecimalFormat;

public class circle {
   /*  1. create a custom class called Circle
            Attributes:
    radius, diameter, area, perimeter
    methods:
    caculateArea: returs the area of the circle
    calculatePerimeter: returns the perimeter of the circle
    setInfo: initializes all the instance of the Circle
    toString methods*/

    public double radius, diameter, area, perimeter;

    public double calculateArea() {
        return radius * radius * Math.PI;

    }

    public double calculkatePrimitive() {
        return diameter * Math.PI;

    }

    public void setInfo(double radius) {
        this.radius = radius;
        diameter = 2 * radius;
        area = calculateArea();
        perimeter = calculkatePrimitive();
    }

    public String toString() {
        DecimalFormat df=new DecimalFormat("0.00");

        return "circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }

public boolean equals(circle circle){
    return  this.radius==circle.radius;
}





}
