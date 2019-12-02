package ke_thua.LopCircleVaLopCylinder;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Circle testCircle = new Circle();
        Scanner input=new Scanner(System.in);
        System.out.println("Input radius");
        testCircle.setRadius(input.nextDouble());
        System.out.println("Input color");
        testCircle.setColor(input.nextLine());
        System.out.println("Input height");

        Cylinder testCircle2= new Cylinder();
        testCircle2.setHeight(input.nextDouble());

        System.out.println("Area:  "+testCircle.getArea());
        System.out.println("Volume:  "+testCircle2.getVolume());

    }
}
