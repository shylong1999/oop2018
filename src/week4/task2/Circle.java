package week4.task2;

public class Circle extends Shape {
    protected double radius;
    final double pi = 3.14;

    public Circle(String color, boolean filled, String shapeColor) {
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(String color, boolean filled,double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return (radius*radius)*pi;
    }
    public double getPerimeter(){
        return 2*radius*pi;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", pi=" + pi +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
