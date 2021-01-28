package day_50Polymorphism;

import day_48_Abstraction.AnimalTask.Animal;
import day_48_Abstraction.AnimalTask.dog;
import day_48_Abstraction.AnimalTask.dolphin;

public class instanceofKeyword {
    public static void main(String[] args) {


    Animal animal=new dog("xx","yy","m",'m',2);

    boolean isDog=animal instanceof dog;
    boolean isdolphin=animal instanceof dolphin;
    boolean isanimal=animal instanceof Animal;

        System.out.println(isDog);
        System.out.println(isdolphin);
        System.out.println(isanimal);
        System.out.println();


}
}
