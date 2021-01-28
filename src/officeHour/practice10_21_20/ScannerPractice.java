package officeHour.practice10_21_20;
import java.util.Scanner;
public class ScannerPractice {
    public static void main(String[] args) {

       Scanner input=new Scanner(System.in);
        System.out.println("pls enter youur score");
     int score=   input.nextInt();
input.close();
String grade="";
if (score>=0&&score<=100){
    if (score>=90){
        grade="A";
    }else if (score>=80){
        grade="B";
    }else if (score>=70){
        grade="C";
    }else if (score>=60){
        grade="D";
    }else{
        grade="F";
    }

}else{
    System.out.println("invalid enrtry");
}

        System.out.println(grade);









    }
}
