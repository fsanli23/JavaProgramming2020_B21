package officeHour.practice_11_27_2020;

public class removeSpecialChar {
    public static void main(String[] args) {


        String str = "ab@cd$^7*^$#*";//remove special char


        String result="";
        for (char each:str.toCharArray()){
            if (!Character.isLetterOrDigit(each)){
                result+=each;
            }
        }
        System.out.println(result);
    }
}
