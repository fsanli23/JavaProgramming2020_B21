package day_48_Abstraction.AnimalTask;

public  final class eagle extends Animal implements predator,flyable {
    public eagle(String name, String breed, String size, char gender, int age) {
        super(name, breed, size, gender, age);
    }

    @Override
    public void sleep() {
        System.out.println("eagles sleep 6 hours");
    }


    @Override
    public void hunt() {
        System.out.println("eagle hunts snake");
    }

    @Override
    public void fly() {
        System.out.println("eagle can fly long hours");
    }
}
