package day_12NestedIfs;

public class loan {
    public static void main(String[] args) {
          int creditscore=550;
        double minumumsalary=25000;
        double jobhistory=15;
        if (minumumsalary>=30000){
            if (jobhistory>=2){
                if (creditscore>=680){
                    System.out.println("you are qualified");
                }
                System.out.println("you qualified for loan");
            }else{
                System.out.println("you must have at least 2 years on the job");
            }


        }else{
            System.out.println("you must have minumumm of 30k salary");
        }







    }
}
