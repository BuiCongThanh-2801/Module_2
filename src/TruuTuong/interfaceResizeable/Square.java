package TruuTuong.interfaceResizeable;

public class Square extends Rectangle implements Resizeable {
   public Square(){
   }
   public Square(double side){
       super(side,side);
   }
    public Square(double side,String color, boolean filled) {
        super(color, filled, side, side);
    }
    public void setSide(double side){
       super.setWidth(side);
       super.setLenght(side);
    }
    @Override
    public void setWidth(double width){
       setSide(width);
    }
    @Override
    public void setLenght(double lenght){
       setSide(lenght);
    }
    @Override
    public String toString(){
       return "Area" + getArea();
    }

}
