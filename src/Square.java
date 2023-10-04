public class Square extends Rectangle{
    public Square(double A) {
        super(A);
    }

    @Override
    public void draw(){
        System.out.println("Im " + Shapes.SQUARE);
    }
}
