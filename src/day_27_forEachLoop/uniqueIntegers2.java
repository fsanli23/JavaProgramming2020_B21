package day_27_forEachLoop;

public class uniqueIntegers2 {
    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 3, 3, 4, 1};


        for (int each2 : arr
        ) {


            int freq = 0;
            for (int each : arr
            ) {
                if (each == each2)
                    freq++;

            }

        }


    }
}
