package officeHour.practice_11_25_2020;

public class methodPractice2 {
    public static void main(String[] args) {

      /*int b=  max(5,3)*2;
       System.out.println(max(8,2));
        System.out.println(b);
*/

        System.out.println(max(1,5,9));

    }

    public static int max(int a,int b){
        int max=(a>=b)?a:b;
        return max;
    }

    public static int max(int a,int b,int c){
        return max(max(a,b),c);
    }




}
