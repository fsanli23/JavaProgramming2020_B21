package day_11MultiBranch;

public class ternarypractice {
    public static void main(String[] args) {

        int n=5;
        String result1;
        if (n%2==0){
            result1="even";
        }else{
            result1="odd";
        }
        System.out.println("========================================================");

String result2=(n%2==0)?"even":"odd";
        System.out.println(result2);

        System.out.println("========================================================");

int age=25;
String citizinship="USA";
String eligabletovote= (age>=18&& citizinship=="USA")?"eligibletovote":"not eligable";

        System.out.println(eligabletovote);
        System.out.println("=====================================");

int personage=18;

String buyalcohol=(personage>=21)?"eligibletobuyalcol":"noteligibletobuy alcoh";


        System.out.println(buyalcohol);
        System.out.println("=================================================");
        int number=1000;
                String s1=(number>0)?"positive":"negative";

        System.out.println(s1);
String s2;
        if (number > 0) {
            s2="positive";
        }else{
            s2="negative";
        }
        System.out.println(s2);




    }
}
