package day_12NestedIfs;

public class AgeGroup3 {
    public static void main(String[] args) {



    /*    if {//it becomes false when age>3
            agegroup="infant";
        }else if {//becaomes false when ages >= 6
            agegroup=;
        }else if {
            agegroup=;
        }else if {//age<=12
            agegroup=;
        }else if {//age<=17
            agegroup=;
        }else if {//age<=20
            agegroup=;
        }else if {//age<=39
            agegroup=   ;
        }else if {//age<=50
            agegroup=;
        }else if {
            agegroup=;
        }else if {
            agegroup=;
        }else if {
            agegroup=;
        }else if {
            agegroup=;
        }else{
            agegroup=;
        }
*/
        int age=45;String agegroup;

        String agegroups=(age>=1&&age<=2)?"infant":(age<=5)?"toddler":(age<=9)?"kid":(age<=12)?"pre teen"

        :(age<=17)?"teen ager":(age<=20)?"young adult":(age<=39)?"adult":(age<=49)?"young middle aged group":

                (age<=54)?"middle age adult":(age<=64)?"very young senior":(age<=74)?"young senior citizen":

                        (age<=84)?"senior citizen":"old senior citizen";
        System.out.println(agegroups);

    }
}
