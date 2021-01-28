package day10_ifElseStatement;

public class validTriangle {
    public static void main(String[] args) {

      double angle1=60;
      double angle2=30;
      double angle3=90;
      boolean isvalid=(angle1+angle2+angle3)==180;

      if (isvalid){
          System.out.println("it is a valid triangle");
      }
      if (!isvalid){
          System.out.println("it is not a valid tgriangle");
      }
      //if it is valid triangle,then check it is right triangle
       //if parantesis should be boolean value






    }
}
