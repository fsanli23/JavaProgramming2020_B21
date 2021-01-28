package officeHour.practice_12_23_2020.ScrumTask;

import java.util.ArrayList;

public class ScrumTeam {
    private PO PO;//scrum team has product owner
    private scrumMaster scrumteam;//scrumteam has  a scrummaster
    private BA Ba;//scrumteam has a bussines analyst

    public ArrayList<tester> testers = new ArrayList<>();
    public ArrayList<developer> developers = new ArrayList<>();

    public PO getProductowner() {
        return PO;
    }

    public void setPO(PO productOwner) {
        this.PO = productOwner;
    }

   

    public scrumMaster getScrumteam() {
        return scrumteam;
    }

    public void setScrumteam(scrumMaster scrumteam) {
        this.scrumteam = scrumteam;
    }

}
