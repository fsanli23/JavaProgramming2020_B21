package day_22JavaRecap;

public class freguencyofasinglechar {
    public static void main(String[] args) {

        String str="i like to learn java,i would love to join cybertek";

        char ch='e';
        int count=0;
        for (int i=0;i<=str.length()-1;i++){
         char   eachcahr=str.charAt(i);//represent each charcater from the string
            if (ch==eachcahr){
                count++;
            }
        }

        





    }
}
