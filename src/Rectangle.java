public class Rectangle extends Polygon{
    private double A;
    private double B;
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
    public Rectangle(double A, double B) {
        super(4);
        this.A=A;
        this.B=B;
    }
    public Rectangle(double A){
        super(4);
        this.A=A;
        this.B=A;
    }
    @Override
    public double area() {
        return A*B;
    }
    @Override
    public double perimeter() {
        return (A+B)*2;
    }

    @Override
    public void draw(){
        if (A==B){
            System.out.println("Im " + Shapes.SQUARE);
        }else{
        System.out.println("Im" + Shapes.RECTANGLE);}
    }
}
