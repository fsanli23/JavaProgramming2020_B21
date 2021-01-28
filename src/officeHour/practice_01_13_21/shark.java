package officeHour.practice_01_13_21;

public final class shark extends animal{

    public shark(String size, String name, String breed, char gender, int age) {
        super(size, name, breed, gender, age);
    }

    @Override
    public void speak() {
        System.out.println("doo dodo dodod");
    }

    @Override
    public String toString() {
        return " shark "+ super.toString();
    }
}
