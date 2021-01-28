package day_27_forEachLoop;

public class uniqueIntegers {
    public static void main(String[] args) {
      /*  Task:
        1. write a program that can print out the unique numbers from an array of integers
        Ex:
        int[] arr ={1,1,2,3,3,4}
        output:
        2 4
*/

        int[] arr = {1, 1, 2, 3, 3, 4};

        int element = arr[0];
        int frequency = 0;

        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == element) {
frequency++;
            }
        }
        System.out.println(frequency);
        if(frequency==1){
            System.out.println(element+" ");
        }






    }
}
