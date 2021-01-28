package officeHour.practice_10_28_2020;

public class ferequencyOfCharcater {
    public static void main(String[] args) {

        String str="aaaaaaaaaabbbbcccccccaaaaaa";
        int count=0;
        char ch='a';


        for (int i=0;i<=str.length()-1;i++){
            if (str.charAt(i)==ch){
                count++;
            }
        }


        System.out.println(count);












    }
}
