package mang_va_phuong_thuc_trong_java;

public class TestSimpleCircle {
    public static void main(String[] args) {
        SimpleCircle circle1= new SimpleCircle();
        System.out.printf("The area of the circle of radius" + circle1.radius + " is"+circle1.getAre());
        SimpleCircle circle2=new SimpleCircle(25);
        System.out.printf("The area of the circle of radis" + circle2.radius + "is " + circle2.getAre());
        SimpleCircle circle3 = new SimpleCircle();
        System.out.printf("The area of the circle of radius" + circle3.radius + "is" + circle3.getAre());
        circle2.radius=100;
        System.out.printf("The area of the circle of radius" + circle2.radius + "is" + circle2.getAre());
    }
}
