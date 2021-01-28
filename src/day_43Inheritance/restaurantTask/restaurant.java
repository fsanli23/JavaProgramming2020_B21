package day_43Inheritance.restaurantTask;

import java.util.ArrayList;
import java.util.Arrays;

public class restaurant {

    public static boolean haskitchen;
    public static boolean hascashier;
    public String owner;
    public ArrayList<server> servers;
    public ArrayList<chef> chefs;

    public restaurant(String owner) {
        this.owner = owner;
        servers = new ArrayList<>();
        chefs = new ArrayList<>();
    }

    static {
        hascashier = true;
        haskitchen = true;
    }

    public void hireserver(server server) {
        servers.add(server);
    }

    public void hireserver(server[] servers) {
        //  this.servers.addAll(Arrays.asList(servers));

        for (server each : servers) {
            hireserver(each);// hirin each server one by one
        }

    }

    public void hirechef(chef chef) {
        chefs.add(chef);
    }

    public void hirechef(chef[] chef) {
        chefs.addAll(Arrays.asList(chef));
    }

    public void terminateemployee(String ID) {
        servers.removeIf(p -> p.ID.equals(ID));
        chefs.removeIf(p -> p.ID.equals(ID));
    }


    public String toString() {
        return "restaurant{" +
                "owner='" + owner + '\'' +"total number of" +
                "the employee"+servers.size()+chefs.size()+
                '}';
    }
}
