public class Triangle extends Polygon{
    private double A;
    private double B;
    private double C;

    public void setA(double A){
        this.A=A;
    }
    public double getA(){
        return A;
    }
    public void setB(double B){
        this.B=B;
    }
    public double getB(){
        return B;
    }
    public void setC(double C){
        this.C=C;
    }
    public double getC(){
        return C;
    }
    public Triangle(double A, double B, double C) {
        super(3);
        this.C=C;
        this.A=A;
        this.B=B;
    }
    @Override
    public double area() {
        double s = (A + B + C) / 2;
        return Math.sqrt(s*(s-A)*(s-B)*(s-C));
    }
    @Override
    public double perimeter() {
        return A + B + C;
    }

    @Override
    public void draw(){
        System.out.println("Im " + Shapes.TRIANGLE);
    }
}
