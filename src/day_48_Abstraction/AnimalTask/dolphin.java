package day_48_Abstraction.AnimalTask;

public final class dolphin extends  Animal implements swimable,playable{
    public dolphin(String name, String breed, String size, char gender, int age) {
        super(name, breed, size, gender, age);
    }

    @Override
    public void sleep() {
        System.out.println("sophins sleeps 11 hours");
    }


    @Override
    public void swim() {
        System.out.println("dolphin can swim 10hours");
    }

    @Override
    public void play() {
        System.out.println("dolphin play with human" +
                "");
    }
}
