package day_43Inheritance.personTask;

public class person {

    // name, age, gender
    //setInfo, eat(), sleep()
    public String name;
    public int age;
    public char gender;

    public void setinfo(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void eat() {
        System.out.println(name + "is eating");
    }

    public void sleep() {
        System.out.println(name + "is sleeping");

    }


    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
