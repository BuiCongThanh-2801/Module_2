package TruuTuong.interfaceResizeable;

public class Circle extends Shape implements Resizeable {
    private double radius=1.0;

    public Circle(){
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea (){
        return this.getRadius()*this.getRadius()*Math.PI;
    }
    public double getPerimeter(){
        return this.getRadius()*2*Math.PI;
    }
    @Override
    public String toString(){
        return "radius= "+ getRadius()
                +" Area = "+ getArea()
                +"Perimeter = "+ getPerimeter();
    }

    @Override
    public void resize(double pecent) {
        System.out.println("A Area of Cricle after resize: " +pecent+ "% tăng lên : " + (getArea()+getArea()*pecent/100));
    }
}
