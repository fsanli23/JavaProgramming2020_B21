package day_27_forEachLoop;

public class reverseString {
    public static void main(String[] args) {

        String[] names={"delaram","aysel","snoop","ayse","erjon"};

        for (String eachName:names) {
 String reversedName="";
 for (int i=eachName.length()-1;i>=0;i--){
     reversedName+=eachName.charAt(i);
 }
 System.out.println(reversedName);
        }











    }
}
