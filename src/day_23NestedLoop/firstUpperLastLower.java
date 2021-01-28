package day_23NestedLoop;

public class firstUpperLastLower {
    public static void main(String[] args) {
        String str="Cybertek";
        char firstcharcter= str.charAt(0);
        char lastcharcater=str.charAt(str.length()-1);


        boolean start=firstcharcter>='A'&& firstcharcter<='Z';
        boolean  end= lastcharcater>='a'&& lastcharcater<='z';

if (start&&end){
    System.out.println("true");
}else{
    System.out.println("false");
}


    }
}
