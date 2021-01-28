package day_48_Abstraction.AnimalTask;

public final class shark extends Animal implements predator,swimable{
    public shark(String name, String breed, String size, char gender, int age) {
        super(name, breed, size, gender, age);
    }

    @Override
    public  void sleep() {
        System.out.println("sharks sleep3 hours");
    }


    @Override
    public void hunt() {
        System.out.println("sharks hunt fish");
    }

    @Override
    public void swim() {
        System.out.println("sahrks swim 20 hours ");
    }
}
