public class Square extends Rectangle{

   private final static int SIDES = 4;

    public Square(double sideA) {
        super(SIDES);
    }

    @Override
    public void draw(){
        System.out.println("Im " + Shapes.SQUARE);
    }
}
