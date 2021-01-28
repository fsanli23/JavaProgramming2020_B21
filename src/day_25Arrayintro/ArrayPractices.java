package day_25Arrayintro;

public class ArrayPractices {
    public static void main(String[] args) {

        String[] student = new String[5];//max index number can be 4.
        student[0] = "agalar";
        student[1] = "mohammad";
        student[2] = "afrooz";
        student[3] = "dargisa";
        student[4] = "elvira";
        System.out.println(student[0]);
        System.out.println(student[1]);
        System.out.println(student[2]);
        System.out.println(student[3]);
        System.out.println(student[4]);
        System.out.println("============================================");

        for (int i = 0; i < student.length; i++) {
            System.out.println(student[i]);
        }


    }
}
