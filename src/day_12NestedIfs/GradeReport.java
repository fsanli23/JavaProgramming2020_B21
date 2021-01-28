package day_12NestedIfs;

public class GradeReport {
    public static void main(String[] args) {

     int score=90;
     String grade="";
     if (score>=0&&score<=100){
         grade=(score>=90)?"a":(score>=80)?"b":(score>=70)?"c":(score>=60)?"d":"f";






     }else{
         System.out.println("invalid");
     }


        System.out.println(grade);

    }
}
