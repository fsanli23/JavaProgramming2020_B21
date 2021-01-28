package day_22JavaRecap;

public class StringPractice3 {
    public static void main(String[] args) {

        String sentence="Capital of canada is washington";
      sentence=  sentence.replace("canada","united states");

        System.out.println("sentence = " + sentence);

String s="Cybertek school is in boston,Cybertek campus is in Mclean";
s=s.replaceFirst("Cybertek","MIT");
        System.out.println(s);



        String r=" cava is cool programming language,i like to learn cava at cybertek school";

        r=r.replace("ca","ja");

        System.out.println(r);




        String p="i like java and java java java java java  java";

        p=p.replace("java","c#").replace("like","like java");
        System.out.println(p);

        System.out.println("".isEmpty());

        System.out.println("===========================");

     String URL="https://www.amazon.com";
     boolean isvalid=URL.startsWith("http")&&URL.endsWith(".com")||URL.endsWith(".edu")||URL.endsWith(".gov");

        System.out.println(isvalid);

//valid email=gmail,hotmail,yahoo,outlook

String email="java_maeters@yahoo.com";

boolean validemail=email.endsWith("gmail.com")||email.endsWith("hotmail.com")||email.endsWith("yahoo.com")||email.endsWith("outlook");


if (validemail){
    System.out.println("valid");
}else{
    System.out.println("invalid");
}
        System.out.println("====================");








    }
}
