package day_48_Abstraction.AnimalTask;

public final class parrot extends Animal implements flyable,playable{


    public parrot(String name, String breed, String size, char gender, int age) {
        super(name, breed, size, gender, age);
    }

    @Override
    public void sleep() {
        System.out.println("parrots sleep 4 hours");
    }


    @Override
    public void fly() {
        System.out.println("parrot can fly 1 hour");
    }


    @Override
    public void play() {
        System.out.println("parrot can play");
    }

    public void talk(){
        System.out.println("parrots talking");
    }



}
