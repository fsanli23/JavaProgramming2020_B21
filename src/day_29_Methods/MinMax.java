package day_29_Methods;

public class MinMax {
    public static void main(String[] args) {
       /* task:
        1. create a function that can print out the maximum number from any given integer array
        2. create a function that can print out the minimum number from any given integer array
        3. create a function that can print the unique elements from the array
*/
        int [] arr={1,5,4,151,88,45};
 max(arr);
min(arr);
    }
    public  static void max(int [] no){
int maxno=no[0];
for (int i=0;i<=no.length-1;i++){
    if (no[i]>maxno){
        maxno=no[i];
    }
}
        System.out.println(maxno);
    }
    public static void min( int []no){
        int minno=no[0];
        for (int i=0;i<=no.length-1;i++){
            if (no[i]<minno){
                minno=no[i];
            }
        }
        System.out.println(minno);
    }

}
