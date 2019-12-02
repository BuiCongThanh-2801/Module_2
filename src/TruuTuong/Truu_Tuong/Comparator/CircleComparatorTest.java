package TruuTuong.Truu_Tuong.Comparator;

import ke_thua.LopCircleVaLopCylinder.Circle;

import java.util.Arrays;
import java.util.Comparator;
public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles=new Circle[3];
        circles[0]= new Circle(3,"red");
        circles[1]= new Circle();
        circles[2]= new Circle(3,"green");

        System.out.println("Pre-sorted: ");
        for (Circle circle: circles){
            System.out.println(circle);
        }
        Comparator circleComparator= new CircleComparator();
        Arrays.sort(circles,circleComparator);

        System.out.println("After- sorted: ");
        for (Circle circle: circles){
            System.out.println(circle);
        }
    }
}
