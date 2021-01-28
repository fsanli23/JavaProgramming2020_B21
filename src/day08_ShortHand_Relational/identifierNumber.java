package day08_ShortHand_Relational;

public class identifierNumber {
    public static void main(String[] args) {

        int number = -400;
        boolean ispositive = number > 0;
        boolean isnegative = number < 0;
        boolean isequal = number == 0;

        System.out.println(number + "is positive number:" + ispositive);
        System.out.println(number + "is negative number:" + isnegative);
        System.out.println(number + "is equal to: " + isequal);

        int angle1 = 30;
        int angle2 = 30;
        int angle3 = 90;
        // triangle is valid:false//
        boolean sum = angle1 + angle2 + angle3 == 180;
        System.out.println("tringe is valid: " + sum);


    }
    //100 is positive number
    //100 is negative number
    //100 is zero


}
