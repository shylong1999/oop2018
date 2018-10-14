package week4.task2;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape("red",true);
        Circle circle = new Circle(1.0);
        Rectangle rectangle = new Rectangle(1.0,1.0);
        Square square = new Square();
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        System.out.println(shape.toString());
        System.out.println(square.toString());

    }
}
