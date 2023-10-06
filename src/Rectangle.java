public class Rectangle extends Polygon{

//    все поля с маленькой буквы и с полноноценным названием
    private double A;
    private double B;
    private final static int SIDES = 4;

    public Rectangle(double A, double B) {
        super(SIDES);
        this.A=A;
        this.B=B;
    }
    public Rectangle(double A){
        super(SIDES);
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
    public void draw() {
        if (A == B) {
            System.out.println("Im " + Shapes.SQUARE);
        } else {
            System.out.println("Im " + Shapes.RECTANGLE);
        }
    }

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
}
