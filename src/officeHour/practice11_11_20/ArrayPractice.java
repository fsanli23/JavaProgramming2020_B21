package officeHour.practice11_11_20;

public class ArrayPractice {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8,};

        for (int arr1el : arr1)
            for (int arr2el : arr2)
                if (arr1el == arr2el)
                    System.out.print(+arr1el+",");


    }









}
