package week4.task1;

public class Apple extends Fruit {
    protected String color;
    protected String weight;


    Apple(){

    }
    public Apple(String name, double price, String color, String weight) {
        super(name, price);
        this.color = color;
        this.weight = weight;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", weight='" + weight + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
