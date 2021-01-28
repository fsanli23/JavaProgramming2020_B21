package day_23NestedLoop;

public class DoWhileLoop {
    public static void main(String[] args) {

       boolean condition=false;
       while(condition){// if condition false neveer execute statement.
           System.out.println("hello");// will print zero times.
       }
        System.out.println("==========================");

        do{
            System.out.println("hello");// do first think later.
        }while (!condition);


    }
}
