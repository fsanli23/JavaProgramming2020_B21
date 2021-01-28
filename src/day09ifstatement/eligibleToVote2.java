package day09ifstatement;

public class eligibleToVote2 {
    public static void main(String[] args) {

        String name="daniel";
        boolean isusacitizen=true;
        int age=38;
        boolean iseligible=isusacitizen==true&&age>=18;
        System.out.println(name+" is eligible to vote: "+iseligible);

String name2="john";
String c1="usa";
String c2="canada";
boolean eligible=c2=="canada"&& c1=="canada";
        System.out.println(name2+"is eligible to vote:"+eligible);



    }
}
