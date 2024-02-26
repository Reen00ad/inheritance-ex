public class Square extends Rectangle{

     Square(){

    }
    public Square(double side) {
        super(side, side);
    }

    public Square(double side,String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide(){
         return width;
    }
    public void setSide(double side){
         width=side;
         length=side;
    }

    @Override
    public String toString() {
        return "A square with side = "+getSide()+" which is subclass of "+super.toString();
    }
}
