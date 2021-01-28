package day_39staticBlock;

import java.util.ArrayList;
import java.util.Arrays;

public class carpetoject {
    public static void main(String[] args) {

        carpeet[] carpets = {new carpeet(), new carpeet(), new carpeet(), new carpeet(), new carpeet()};

        carpets[0].customorder(5, 7, 15, false);
        carpets[1].customorder(5, 7, 15, true);
        carpets[2].customorder(8, 10, 12, false);
        carpets[3].customorder(10, 15, 13, true);
        carpets[4].customorder(18, 20, 20, true);

        ArrayList<carpeet> persianCarspets = new ArrayList<>(Arrays.asList(carpets));
        persianCarspets.removeIf(p -> !p.ispersian);


        ArrayList<carpeet> regularCarpeet = new ArrayList<>(Arrays.asList(carpets));
        // regularCarpeet.removeAll(persianCarspets);
        regularCarpeet.removeIf(p -> p.ispersian);

        System.out.println("=====================================================");
        double totalpriceofthepersioncarpet = 0;
        for (carpeet each : persianCarspets) {
            System.out.println(each);
            totalpriceofthepersioncarpet += each.calcost();
        }
        System.out.println(" totalpriceofthepersioncarpet=" + totalpriceofthepersioncarpet);

        System.out.println("==========================================");

        double totoalpriceOfTheregular = 0;
        for (carpeet each : regularCarpeet) {
            System.out.println(each);
            totoalpriceOfTheregular += each.calcost();
            System.out.println("totol price" + totoalpriceOfTheregular);
        }
        System.out.println("=========================================");
double totalprice=totalpriceofthepersioncarpet+totoalpriceOfTheregular;

        System.out.println("total price="+totalprice);
    }
}
