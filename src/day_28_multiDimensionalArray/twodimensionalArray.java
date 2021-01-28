package day_28_multiDimensionalArray;

import java.util.Arrays;

public class twodimensionalArray {
    public static void main(String[] args) {
/*

int [] a={1,2,3,4};
int [] b={5,6};
int [] c={7,8,9};
int [] e={10,11,12};
int [] d={13,14,15,16,17};
*/


 int [][] arr2d={{1,2,3,4}  ,  {5,6}  ,  {7,8,9},  {10,11,12} ,   {13,14,15,16,17} };
                //  0            1          2           3                 4


       // System.out.println(Arrays.toString(arr2d[0]));
int min=arr2d[0][0];
int max=arr2d[0][0];
for (int i=0;i<=arr2d.length-1;i++){//i =is the index number of single dimansional array;
    int [] arr1d=arr2d[i];
     for (int j=0;j<=arr1d.length-1;j++){ //j =index numbers of the elements in each single dimenson
       int eachelemnt=arr1d[j];
       if (eachelemnt>max){
           max=eachelemnt;
       }
         if (eachelemnt < min) {

             min=eachelemnt;
         }
     }

}

        System.out.println(max);
        System.out.println(min);

    }
}
