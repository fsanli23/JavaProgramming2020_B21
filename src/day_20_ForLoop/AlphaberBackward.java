package day_20_ForLoop;

public class AlphaberBackward {
    public static void main(String[] args) {

        for (char i=90;i>=65;i--){
            System.out.print(i+",");
        }
        System.out.println();
for (char i='Z';i>='A';i--) {
    System.out.print(i+" ,");


    }

        System.out.println("============================");

for (int i=122;i>=97;i--){
    System.out.print((char)i+",");
}
        System.out.println();

for (char i='a';i>='z';i--){
    System.out.print(i+",");
}

        System.out.println("==========================");
String str="fatih sanli";






for (int i=str.length()-1;i>=0;i--){
    System.out.print(str.charAt(i));
}






    }
}
