package TruuTuong.interfaceResizeable;

public class Rectangle extends Shape implements Resizeable{
    private double width=1.0;
    private double lenght= 1.0;

    public Rectangle(){

    }
    public Rectangle(double width, double lenght){
        this.width=width;
        this.lenght= lenght;


    }

    public Rectangle(String color, boolean filled, double width, double lenght) {
        super(color, filled);
        this.width = width;
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }
    public double getArea(){
        return this.width* this.lenght;
    }
    public double getPerimeter(){
        return (this.lenght+this.width)*2;
    }
    @Override
    public String toString(){
        return "Width= " + getWidth()+
                "Lenght = " + getLenght()+
                "Area = " + getArea()+
                "Perimeter = " + getPerimeter()
                +super.toString();

    }

    @Override
    public void resize(double pecent) {
        System.out.println("A Area of Rectangle after resize : " + pecent + "% tang len la" + (getArea()+getArea()*pecent/100));
    }
}
