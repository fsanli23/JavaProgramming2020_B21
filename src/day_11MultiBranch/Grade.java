package day_11MultiBranch;

public class Grade {
    public static void main(String[] args) {
        int score=58;
        String grade;

        if (score<=59){
            grade="F";
        }else if (score>=60&&score<=69){
            grade="D";
        }else if (score>=70&&score<=79){
            grade="C";

        }else if (score>=80&&score<=89){
            grade="B";
        }else{
            grade="A";
        }
        System.out.println(grade);










    }

}
