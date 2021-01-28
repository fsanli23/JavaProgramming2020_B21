package officeHour.practice_12_09_2020;

public class CybertekStudent {

    public String name;
    public int age;
    public char gender;


    public static String schoolname="Cybertek school";
    public static String dreamJob="SDET";
    public static boolean hasReplit=true;
    public  static boolean hasflipgrid=true;


    public void setInfo(String name,int age,char gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }


    public String toString() {
        return "CybertekStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
