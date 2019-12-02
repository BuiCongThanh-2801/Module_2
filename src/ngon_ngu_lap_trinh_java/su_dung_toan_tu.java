package ngon_ngu_lap_trinh_java;

import java.util.Scanner;

public class su_dung_toan_tu {
    public static void main(String [] agrs){
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter width:" );
        width = scanner.nextFloat();

        System.out.println("Enter height :");
        height = scanner.nextFloat();

        float area= width * height;
        System.out.println("Area is :" + area);
    }
}
