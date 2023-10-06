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

    public void setA(double sideA) {
        this.sideA = sideA;
    }

    public double getA() {
        return sideA;
    }

    public void setB(double sideB) {
        this.sideB = sideB;
    }

    public double getB() {
        return sideB;
    }

    public void setC(double sideC) {
        this.sideC = sideC;
    }

    public double getC() {
        return sideC;
    }
}
