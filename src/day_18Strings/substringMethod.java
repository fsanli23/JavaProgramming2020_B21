package day_18Strings;

public class substringMethod {
    public static void main(String[] args) {

        String str="i love programming";
   String    name= str.substring(2,7);//ending index will be exculeded.
        System.out.println("name = " + name);

        String str2="today is monday";
      String day=  str2.substring(9,15);
        System.out.println("day = " + day);

        String n1="apple";
        String n2="banana";
   String new1=     n1.substring(1,n1.length());
        String new2=n2.substring(1,n2.length());

        System.out.println(new1+new2);
        System.out.println(n1.substring(1,5));


    }
}
