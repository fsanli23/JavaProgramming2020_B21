package day_11MultiBranch;

public class maxMin1 {

    public static void main(String[] args) {

        int a=100;
        int b=200;
        int max1=0;
        if (a>b){
            max1=a;
        }else{
            max1=b;
        }
        System.out.println(max1);

int max2=(a>b)?a:b;
        System.out.println(max2);
        System.out.println("====================================================");
int min1=0;
if (a<b){
    min1=a;
}else{
    min1=b;
}
        System.out.println(min1);

 int min2=(a<b)?a:b;
        System.out.println(min1);
        System.out.println("======================================================");

        int month=3;
        boolean hasdays28=month==2;
        boolean has30days=month==4||month==6||month==9||month==11;
        boolean has31days=!hasdays28&&!has30days;















    }
}
