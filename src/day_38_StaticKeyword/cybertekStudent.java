package day_38_StaticKeyword;

public class cybertekStudent {
    public String name;
    public int age;
    public String gender;
    public int groupNumber;
    public static String schoolName;
    public static boolean isOnlineStudent;

    public void study() {
        System.out.println(name + "is studying java");
    }

    public static void getschoolinfo() {
        System.out.println("school is" + schoolName);
    }

    public String toString() {
        return "cybertekStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
