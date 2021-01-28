package day_24NestedLoop;

public class uniqueCharacter {
    public static void main(String[] args) {

     String text="aaaabbbcccadd";

     String s="";
     int count=0;

     for (int i=0;i<=text.length()-1;i++){
         s+=i;
         for (int j=0;j<=s.length()-1;j++){
             if(s==""+text.charAt(j)){
                 count++;
             }
         }
     }
        System.out.println(count);




    }
}
