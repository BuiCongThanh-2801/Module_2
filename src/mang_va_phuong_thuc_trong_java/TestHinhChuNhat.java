package mang_va_phuong_thuc_trong_java;

import java.util.Scanner;

public class TestHinhChuNhat {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.printf("Enter the width: ");
        double width=input.nextDouble();
        System.out.printf("Enter the height: ");
        double height=input.nextDouble();
        Rectangle rectangle= new Rectangle (width,height);
        System.out.printf("Your Rectangle \n" + rectangle.display());
        System.out.printf("Perimeter of the Rectangle \n" + rectangle.getPerimeter());
        System.out.printf("Area of the Rectangle \n" + rectangle.getArea());
    }
}
