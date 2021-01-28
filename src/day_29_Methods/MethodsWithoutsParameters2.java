package day_29_Methods;

public class MethodsWithoutsParameters2 {
    public static void main(String[] args) {


        printoddNumber1to100();
printevenNumber1to100();

    }

    public static void printoddNumber1to100() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i+",");
            }
        }
        System.out.println();
    }
    public static void printevenNumber1to100(){
        for (int i=1;i<=100;i++){
            if (i%2==0){
                System.out.print(i+ ",");
            }
        }
    }


}
