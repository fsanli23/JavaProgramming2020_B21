package day_30_ReturnMethods;

public class ReturnMethod3 {
    public static void main(String[] args) {

        int[] array = {1, 1, 23, 4, 5, 6,};

        int max = max(array);
        System.out.println(max);
        System.out.println(max > 100);


        int[] array1 = {1, 1, 23, 4, 5, 6,};

       int min= min(array1);
        System.out.println(min);
    }


    public static int max(int[] arr) {
        int max = arr[0];
        for (int each : arr) {
            if (each > max) {
                max = each;
            }

        }


        return max;
    }

    public static int min(int[] arr) {
        int min = arr[0];
        for (int each : arr) {
            if (each < min) {
                min = each;
            }
        }
        return min;
    }

}
