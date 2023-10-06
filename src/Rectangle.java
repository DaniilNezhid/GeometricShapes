public class Rectangle extends Polygon{
    private double sideA;
    private double sideB;
    private final static int SIDES = 4;

    public Rectangle(double sideA, double sideB) {
        super(SIDES);
        this.sideA=sideA;
        this.sideB=sideB;
    }
    public Rectangle(double sideA){
        super(SIDES);
        this.sideA=sideA;
        this.sideB=sideA;
    }
    @Override
    public double area() {
        return sideA*sideB;
    }

    @Override
    public double perimeter() {
        return (sideA+sideB)*2;
    }

    @Override
    public void draw() {
        if (sideA == sideB) {
            System.out.println("Im " + Shapes.SQUARE);
        } else {
            System.out.println("Im " + Shapes.RECTANGLE);
        }
    }

    public void setSideA(double sideA){
        this.sideA=sideA;
    }
    public double getSideA(){
        return sideA;
    }
    public void setSideB(double sideB){
        this.sideB=sideB;
    }
    public double getSideB(){
        return sideB;
    }
}
