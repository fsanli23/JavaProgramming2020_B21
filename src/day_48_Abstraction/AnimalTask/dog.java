package day_48_Abstraction.AnimalTask;

public final class dog extends Animal implements playable{

    public dog(String name, String breed, String size, char gender, int age) {
        super(name, breed, size, gender, age);
    }

    @Override
    public void sleep() {
        System.out.println("dog sleeps 8 hours");
    }


    @Override
    public void play() {
        System.out.println("dog play with ball");
    }
}
