public class ShapePrinter {
    public static void PrintInfo(Shape shape){
        shape.draw();
        System.out.print("My area " + shape.area() + " and my perimeter " + shape.perimeter());

    }
}
