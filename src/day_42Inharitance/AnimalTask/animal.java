package day_42Inharitance.AnimalTask;

public class animal {
    public String breed, color, name;
    public char gender;
    public int age;


    public void eat(String food) {
        System.out.println(name + "is eating  " + food);
    }

    public void drink(String drink) {
        System.out.println(name + "is drinking" + drink);
    }

    public void sleep() {
        System.out.println(name + "is sleeping");
    }

}
