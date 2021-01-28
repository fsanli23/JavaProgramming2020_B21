package day_12NestedIfs;

public class AgeGroups2 {
    public static void main(String[] args) {

        int age=45;String agegroup;
        if (age>=1&&age<=2){//it becomes false when age>3
            agegroup="infant";
        }else if (age<=5){//becaomes false when ages >= 6
            agegroup="toddler";
        }else if (age<=9){
            agegroup="kid";
        }else if (age<=12){//age<=12
            agegroup="pre teen";
        }else if (age<=17){//age<=17
            agegroup="teen ager";
        }else if (age<=20){//age<=20
            agegroup="young adult";
        }else if (age<=39){//age<=39
            agegroup="adult"   ;
        }else if (age<=49){//age<=50
            agegroup="young middle aged group";
        }else if (age<=54){
            agegroup="middle age adult";
        }else if (age<=64){
            agegroup="very young senior";
        }else if (age<=74){
            agegroup="young senior citizen";
        }else if (age<=84){
            agegroup="senior citizen";
        }else{
            agegroup="old senior citizen";
        }

        System.out.println(agegroup);













    }
}
