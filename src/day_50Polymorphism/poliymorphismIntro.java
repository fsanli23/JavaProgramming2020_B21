package day_50Polymorphism;

import day_49Abstraction.ShapeTask.Circle;
import day_49Abstraction.ShapeTask.shape;
import day_50Polymorphism.phoneTask.iphone;
import day_50Polymorphism.phoneTask.phone;
import day_50Polymorphism.phoneTask.samsung;

import java.util.ArrayList;
import java.util.Arrays;

public class poliymorphismIntro {
    public static void main(String[] args) {

        iphone iphone = new iphone("iphone 12", "small", "red", 800);
        samsung samsung = new samsung("s20", "medium", "blue", 500);

        phone phone1 = new samsung("s21", "medium", "blue", 600);
        phone phone2 = new iphone("iphone 11", "small", "red", 800);

        ArrayList<phone>list=new ArrayList<>(Arrays.asList(phone1,phone2));


        shape shape;
        shape=new Circle(3);
        System.out.println(shape.area());






    }
}
