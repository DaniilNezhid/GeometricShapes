public class Circle implements Shape{
    private double radius;
    public Circle(double radius){
        this.radius=radius;
    }

    @Override
    public double area() {
        // нужно правильно называть поля что бы было понятно
        double area = Math.pow(radius,2);
        return (Math.PI*area);
    }

    @Override
    public double perimeter() {
        return Math.PI * (2 * radius);
    }
    @Override
    public void draw(){
        System.out.println("Im " + Shapes.CIRCLE);
    }

    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
}
