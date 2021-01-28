package day_41Encapsulation;

public class person {
    private String name;
    private String age;
    private char gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public person(String name, String age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
