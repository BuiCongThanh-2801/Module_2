package TruuTuong.interfaceResizeable;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//
//
//
//
//
//
//        Scanner input= new Scanner(System.in);
//        Circle circle= new Circle();
//        circle.setRadius(5);
//        System.out.println(circle);
//        Rectangle rectangle= new Rectangle();
//        rectangle.setWidth(4);
//        rectangle.setLenght(7);
//        System.out.println(rectangle);
//        Square square= new Square();
//        square.setSide(6);
//        System.out.println(square);
        Shape[] shapes= new Shape[3];
        shapes[0] = new Square(2.1);
        shapes[1]= new Circle(6);
        shapes[2]= new Rectangle(4, 6.3);

        for (int i=0; i<shapes.length; i++){
            System.out.println(shapes[i]);
        }



    }
}
