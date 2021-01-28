package day_27_forEachLoop;

public class foreachLoop {
    public static void main(String[] args) {



        String[] names={"delaram","aysel","snoop","ayse","erjon"};


        for (int i=0;i<names.length-1;i++){
            System.out.println(names[i]);
        }

        System.out.println("===========================================================");


        for (String each:names // each is element
             ) {
            System.out.println(each);
        }

        System.out.println("===============================================================");



        int []nuberws={1,2,3,4,5,6,7,8,9,10,11,12};
        int  counteven=0;
        int countodds=0;
        for (int each:nuberws){
            if (each % 2==0){
                counteven++;
            }else{
                countodds++;
            }



        }

        System.out.println("countodds = " + countodds);
        System.out.println("counteven = " + counteven);

        System.out.println("==================================================================");





        int [] score={10,2,3,25,5,100,-5,-2,1000,30,40,56};
        int  max=score[0];
        int min=score[0];
         for (int each:score){
             if (each>max){
                 max=each;
             }
             if (each<min){
                 min=each;
             }
         }
        System.out.println(max);
        System.out.println(min);


    }
}
