package day_23NestedLoop;

public class CatAndDog {
    public static void main(String[] args) {

String sentence="dog Dog dog dog cat Cat";
String temp=sentence.toLowerCase();
int countdog=0;
int countcat=0;
while(temp.contains("dog")){
    temp=temp.replaceFirst("dog","empty");
    countdog++;
}
        System.out.println("countdog = " + countdog);

while(temp.contains("cat")){
    temp=temp.replaceFirst("cat","empty");
    countcat++;
}

        System.out.println("countcat = " + countcat);


        System.out.println(countcat==countdog);




    }
}
