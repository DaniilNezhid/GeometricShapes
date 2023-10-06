public class Square extends Rectangle{

    //   изменить  название переменной на понятное

    public Square(double A) {
        super(A);
    }

    @Override
    public void draw(){
        System.out.println("Im " + Shapes.SQUARE);
    }
}
