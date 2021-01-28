package day_38_StaticKeyword.scrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class scrumTeam {
    public String PO, BA, SM;
    public ArrayList<tester> testersTeam = new ArrayList<>();
    public ArrayList<developer> developersTeam = new ArrayList<>();
    public static boolean hasSprint = true;
    public static boolean hasMeeting = true;

    public void setInfo(String PO, String BA, String SM) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;

    }

    public void hireatester(tester tester) {
        testersTeam.add(tester);
    }

    public void removeTester(String ID) {
        testersTeam.removeIf(p -> p.equals(ID));

    }

    public void addDeveloper(developer dev) {
        developersTeam.add(dev);
    }

    public void removeDeveloper(String ID) {
        developersTeam.removeIf(p -> p.equals(ID));
    }

    public void addDeveloper(developer[] developers){
        developersTeam.addAll(Arrays.asList(developers));
    }
 public void hireatester(tester[] tester){
        testersTeam.addAll(Arrays.asList(tester));
 }


    public String toString(){
        return  "Po:"+PO+", BA:"+BA+"SM: "+SM+"total number of tester:"+testersTeam.size()+"\n" +
                "total number of the developer:"+developersTeam.size();
    }
}
