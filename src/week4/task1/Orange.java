package week4.task1;

public class Orange extends Fruit{
    protected String weight;

    protected String color;
    Orange(){

    }

    public Orange(String name, double price, String weight, String color) {
        super(name, price);
        this.weight = weight;
        this.color = color;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Orange{" +
                "weight='" + weight + '\'' +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
