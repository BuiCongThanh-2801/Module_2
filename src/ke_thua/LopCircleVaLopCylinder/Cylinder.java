package ke_thua.LopCircleVaLopCylinder;

public class Cylinder extends Circle {
    public double height;

    // khai báo trường đại diện biến
    public Cylinder(){
    }
    // hàm khai báo mặc định
    public Cylinder(double height) {
        this.height = height;
    }
    // hàm khai báo height
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    // setter gêtter of height
    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }
    // lấy hàm radius và color ở class cha Circle.
    public double getVolume(){
        return this.getArea()*this.height;
    }
    // hàm tính thể tích của hình tròn..
    @Override
    public String toString(){
        return "Height"
                + getHeight()
                +"Volume"
                + getVolume()
                + super.toString();
    }

}
