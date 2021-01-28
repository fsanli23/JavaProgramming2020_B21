package officeHour.practice_01_13_21;

public class cat extends animal {

    public cat(String size, String name, String breed, char gender, int age) {
        super(size, name, breed, gender, age);
    }

    @Override
    public void speak() {

    }


    @Override
    public String toString() {
        return "cat"+super.toString();
    }
}
