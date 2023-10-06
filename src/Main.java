public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(4, 5, 2);
        Rectangle rectangle = new Rectangle(12, 35);
        Rectangle square = new Square(10);
        Circle circle = new Circle(30);

        ShapePrinter.PrintInfo(triangle);
        ShapePrinter.PrintInfo(rectangle);
        ShapePrinter.PrintInfo(square);
        ShapePrinter.PrintInfo(circle);
    }
}