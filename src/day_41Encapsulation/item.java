package day_41Encapsulation;

public class item {
     public String name;
    public int quantitiy;
    public double unitprice;

    public item(String name, int quantitiy, double unitprice) {
        this.name = name;
        this.quantitiy = quantitiy;
        this.unitprice = unitprice;
    }
    public double calscost(){
        return quantitiy*unitprice;
    }


    public String toString() {
        return "item{" +
                "name='" + name + '\'' +
                ", quantitiy=" + quantitiy +
                ", unitprice=" + unitprice +
                ", total price="+calscost()+
                '}';
    }
}
