package day_11MultiBranch;

public class GradeReport {
    public static void main(String[] args) {
      /*  Write a Java Program for the following logic:
§ If marks < 60, then print “Fail”
§ If marks >= 60, but less than 90, then print “Pass”
§ If marks >= 90, then print “Passed with Distinction”*/
        int score=95;
        String result;
        if (score < 60) {
            result="fail";
        }
        else if (score>=60&&score<90){
            result="passed";
        }else{result="passed with extiction";}


        System.out.println(result);




    }
}
