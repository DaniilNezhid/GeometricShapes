public class Main {
    public static void main(String[] args) {
        Triangle Figure1 = new Triangle(4, 5, 2);
        Rectangle Figure2 = new Rectangle(12, 35);
        Rectangle Figure3 = new Rectangle(10);
        Circle Figure4 = new Circle(30);
        Square Figure5 = new Square(10);
        ShapePrinter.PrintInfo(Figure1);
    }
}