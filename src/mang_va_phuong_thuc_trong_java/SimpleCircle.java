package mang_va_phuong_thuc_trong_java;

public class SimpleCircle {
    double radius;
    // construct a circle with radius
    SimpleCircle(){
        radius=1;
    }
    // construct a circle with a specified radius
    SimpleCircle(double newRadius){
        radius=newRadius;
    }
    // return the area of this circle
    double getAre(){
        return radius*radius*Math.PI;
    };

    // return the perimeter of this circle
    double getPerimeter(){
        return 2*radius*Math.PI;
    }
    /// set a new radius for this circle
    void setRadius(double newRadius){
        radius= newRadius;
    }
}
