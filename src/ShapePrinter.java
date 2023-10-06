import java.math.RoundingMode;
import java.text.DecimalFormat;

public class ShapePrinter {

    public static void printInfo(Shape shape) {
        shape.draw();
        System.out.print("My area " + round(shape.area()) + " and my perimeter " + round(shape.perimeter()) + " ");
    }

    private static String round (double value) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        decimalFormat.setRoundingMode(RoundingMode.FLOOR);
        return decimalFormat.format(value);
    }

}
