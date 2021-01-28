package day_37CustomClass;
import java.time.LocalDate;
public class CybertekSchoolObject {

    public static void main(String[] args) {

        CybertekSchool student1 = new CybertekSchool();
        CybertekSchool student2 = new CybertekSchool();
        CybertekSchool student3 = new CybertekSchool();
        CybertekSchool student4 = new CybertekSchool();
        CybertekSchool student5 = new CybertekSchool();
        CybertekSchool student6 = new CybertekSchool();
        CybertekSchool student7 = new CybertekSchool();
        CybertekSchool student8 = new CybertekSchool();
        CybertekSchool student9 = new CybertekSchool();
        CybertekSchool student10 = new CybertekSchool();

        CybertekSchool[] schoolarr = {student1,student2,student3,student4,student5,student6,student7,student7,student8,student9,student10};

student1.setInfo("fatih","12345FS",LocalDate.of(1984,5,1),'m',4);

        System.out.println(student1);

    }
}






