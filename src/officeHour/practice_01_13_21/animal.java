package officeHour.practice_01_13_21;

import com.sun.xml.internal.bind.v2.TODO;

public  abstract class animal {
    public String size,name,breed;
    public  final char gender;
    public int age;

    public static boolean isAnimal=true;

    public abstract void speak();

    public animal(String size, String name, String breed, char gender, int age) {
        this.size = size;
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.age = age;

    }

    @Override
    public String toString() {
        return "animal{" +
                "size='" + size + '\'' +
                ", name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
