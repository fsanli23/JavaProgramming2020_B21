package day_39staticBlock;

public class carpeet {

    public double width, length, unitprice;
    public boolean ispersian;


    public void customorder(double width, double length, double unitprice, boolean ispersian) {
        this.width = width;
        this.length = length;
        this.unitprice = unitprice;
        this.ispersian = ispersian;
    }

    public double calcost() {
        double totalprice = (width * length) * unitprice;
        if (ispersian) {
            totalprice += 200;
        }
        return totalprice;
    }


    public String toString() {
        return "carpeet{" +
                "width=" + width +
                ", length=" + length +
                ", unitprice=" + unitprice +
                ", ispersian=" + ispersian +
                ", totoal price=" + calcost() +
                '}';
    }
}
