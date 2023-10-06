public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(4, 5, 2);
        Rectangle rectangle = new Rectangle(12, 35);
        Rectangle square = new Square(10);
        Circle circle = new Circle(30);

        ShapePrinter.printInfo(triangle);
        ShapePrinter.printInfo(rectangle);
        ShapePrinter.printInfo(square);
        ShapePrinter.printInfo(circle);
    }
}