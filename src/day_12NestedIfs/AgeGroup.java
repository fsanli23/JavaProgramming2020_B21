package day_12NestedIfs;

public class AgeGroup {
    public static void main(String[] args) {
       /* infant (< 1 year)
        Toddler (3 - 5),
                Kid (6 - 9),
                Pre-Teen (10 - 12),
                Teenager (13 - 17),
                Young Adult (18 - 20),
                Adult (21 - 39),
                Young Middle-Aged Adult (40 - 49),
                Middle-Aged Adult (50 - 54),
                Very Young Senior Citizen (55 - 64),
                Young Senior Citizen (65 - 74),
                Senior Citizen (75 - 84),
                Old Senior Citizen (85+)
*/

       int age=35;String agegroup;
       if (age>=1&&age<=2){//it becomes false when age>3
           agegroup="infant";
       }else if (age>=3&&age<=5){//becaomes false when ages >= 6
           agegroup="toddler";
       }else if (age>=6&&age<=9){
           agegroup="kid";
       }else if (age>=10&&age<=12){//age<=12
           agegroup="pre teen";
       }else if (age>=13&&age<=17){//age<=17
           agegroup="teen ager";
       }else if (age>=18&&age<=20){//age<=20
           agegroup="young adult";
       }else if (age>=21&&age<=39){//age<=39
        agegroup="adult"   ;
       }else if (age>=40&&age<=49){//age<=50
           agegroup="young middle aged group";
       }else if (age>=50&&age<=54){
           agegroup="middle age adult";
       }else if (age>=55&&age<=64){
           agegroup="very young senior";
       }else if (age>=65&&age<=74){
           agegroup="young senior citizen";
       }else if (age>=75&&age<=84){
           agegroup="senior citizen";
       }else{
           agegroup="old senior citizen";
       }
        System.out.println(agegroup);















    }
}
