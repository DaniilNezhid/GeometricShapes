public class Circle implements Shape{
    private double radius;
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    public Circle(double radius){
        this.radius=radius;
    }

    @Override
    public double area() {
        double s = Math.pow(radius,2);
        return (Math.PI*s);
    }

    @Override
    public double perimeter() {
        return Math.PI * (2 * radius);
    }
    @Override
    public void draw(){
        System.out.println("Im " + Shapes.CIRCLE);
    }
}
