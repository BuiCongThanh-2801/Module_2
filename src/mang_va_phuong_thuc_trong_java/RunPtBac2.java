package mang_va_phuong_thuc_trong_java;

import java.util.Scanner;

public class RunPtBac2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        // nhập từ bàn phím
        PtBac2 ptBac2= new PtBac2();
        //khai báo đối tượng
        System.out.printf("Mời nhập hệ số thứ nhất");
        ptBac2.setA(input.nextDouble());
        System.out.printf("Mời nhập hệ số thứ hai");
        ptBac2.setB(input.nextDouble());
        System.out.printf("Mời nhập hệ số thứ ba");
        if (ptBac2.getDiscriminant()>=0){
            System.out.printf("  Phương trình có 2 nghiệm");
        }
        else if (ptBac2.getDiscriminant()==0){
            System.out.printf("  Phương trình có 1 nghiệm");
        }
        else {
            System.out.printf("  Phương trình vô nghiệm");
        }
        ptBac2.setC(input.nextDouble());
        System.out.printf("Nghiệm 1 " +ptBac2.getRoot1());
        System.out.printf("Nghiệm 2 " +ptBac2.getRoot2());


    }
}
