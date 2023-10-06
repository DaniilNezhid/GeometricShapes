abstract class Polygon implements Shape {
    private int sides;

    public Polygon(int sides){
        this.sides = sides;
    }
   @Override
    public void draw(){
       System.out.println("Im figure");
    }

    public int getSides() {
        return sides;
    }
}
