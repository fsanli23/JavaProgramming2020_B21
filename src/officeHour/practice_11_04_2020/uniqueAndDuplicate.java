package officeHour.practice_11_04_2020;

public class uniqueAndDuplicate {
    public static void main(String[] args) {

        String str = "aaabbcd";
        String unique = "";
        char ch = str.charAt(0);
        int frequency = 0;


        for (int i=0;i<=5;i++){
            if (str.charAt(i)==ch){
                frequency++;
            }
        }
    }
}
