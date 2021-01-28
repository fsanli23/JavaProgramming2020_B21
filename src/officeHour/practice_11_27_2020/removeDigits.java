package officeHour.practice_11_27_2020;

public class removeDigits {
    public static void main(String[] args) {
        String str="abcd#$%#%^123546#$%$T@#$asf";
        String result="";
        for (Character each:str.toCharArray()){
            if (Character.isDigit(each)){
                result+=each;
            }
        }
        System.out.println(result);




    }
}
