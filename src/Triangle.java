public class Triangle extends Polygon {
    private double sideA;
    private double sideB;
    private double sideC;
    private final static int SIDES = 3;

    public Triangle(double sideA, double sideB, double sideC) {
        super(SIDES);
        this.sideC = sideC;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double area() {
        double area = (sideA + sideB + sideC) / 2;
        return Math.sqrt(area * (area - sideA) * (area - sideB) * (area - sideC));
    }

    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public void draw() {
        System.out.println("Im " + Shapes.TRIANGLE);
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public double getSideC() {
        return sideC;
    }
}
