package week4.task1;

public class SanhOrange extends Orange {
    protected int number;
    protected int ngay_nhap;

    public SanhOrange() {
    }

    public SanhOrange(String name, double price, String weight, String color, int ngay_nhap, int number) {
        super(name, price, weight, color);
        this.ngay_nhap = ngay_nhap;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNgay_nhap() {
        return ngay_nhap;
    }

    public void setNgay_nhap(int ngay_nhap) {
        this.ngay_nhap = ngay_nhap;
    }

    @Override
    public String toString() {
        return "SanhOrange{" +
                "number=" + number +
                ", ngay_nhap=" + ngay_nhap +
                ", weight='" + weight + '\'' +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
