package officeHour.practice_10_28_2020;

public class removeduplicates {
    public static void main(String[] args) {

      String str="fatih sanli"  ;

       String  nondublicated="" ;

       for (int i =0;i<=str.length()-1;i++){
           if (!nondublicated.contains(""+str.charAt(i))){
               nondublicated+=str.charAt(i);

           }
       }

        System.out.println(nondublicated);







    }
}
