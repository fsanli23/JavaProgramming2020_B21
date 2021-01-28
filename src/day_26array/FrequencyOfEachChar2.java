package day_26array;

public class FrequencyOfEachChar2 {
    public static void main(String[] args) {

        String str = "aaabbc";  // "a3b2c1"

String expectedresult="";
char ch=str.charAt(0);
int count=0;
for (int i=0;i<=str.length()-1;i++){//i represent index of str
    char eachChar=str.charAt(i);
    if (eachChar==ch){
        count++;
    }
}
        System.out.println(ch);
        System.out.println(count);

expectedresult+=""+ch+count;

        System.out.println(expectedresult);





    }
}
