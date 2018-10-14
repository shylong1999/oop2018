package week4.task1;

public class CaoPhongOrange extends Orange{
    protected int number;
    protected int ngay_nhap;

    public CaoPhongOrange() {

    }

    public CaoPhongOrange(String name, double price, String weight, String color, int number, int ngay_nhap) {
        super(name, price, weight, color);
        this.number = number;
        this.ngay_nhap = ngay_nhap;
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
        return "CaoPhongOrange{" +
                "number=" + number +
                ", ngay_nhap=" + ngay_nhap +
                ", weight='" + weight + '\'' +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
