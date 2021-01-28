package library;

import java.util.Arrays;

public class ArraysUtility {
    public static int max(int[] arr) {
        int max = arr[0];
        for (int each : arr) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }

    public static int max2(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
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

    public static int[] addElement(int[] array, int element) {
        int[] result = new int[array.length + 1];

        for (int i = 0; i <= array.length - 1; i++) {
            result[i] = array[i];
        }

        result[result.length - 1] = element;

        return result;
    }//add elemnets to int array

    public static double[] addElement(double[] array, double element) {
        double[] result = new double[array.length + 1];

        for (int i = 0; i <= array.length - 1; i++) {
            result[i] = array[i];
        }

        result[result.length - 1] = element;

        return result;
    }//add elemnets to double array

    public static char[] addElement(char[] array, char element) {
        char[] result = new char[array.length + 1];

        for (int i = 0; i <= array.length - 1; i++) {
            result[i] = array[i];
        }

        result[result.length - 1] = element;

        return result;
    }//add elemnets to char array


    public static String[] addElement(String[] array, String element) {
        String[] result = new String[array.length + 1];

        for (int i = 0; i <= array.length - 1; i++) {
            result[i] = array[i];
        }

        result[result.length - 1] = element;

        return result;
    }//add elemnets to string array

}