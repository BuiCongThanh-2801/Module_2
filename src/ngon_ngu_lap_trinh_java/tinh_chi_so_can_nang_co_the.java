package ngon_ngu_lap_trinh_java;

import java.util.Scanner;

public class tinh_chi_so_can_nang_co_the {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.printf("Nhập cân nặng");
        double canang=input.nextDouble();
        System.out.printf("Nhập chiều cao");
        double chieucao=input.nextDouble();
        double bmi=canang/chieucao*chieucao;
        if (bmi<18.5){
            System.out.printf("Thiếu cân");
        }
        else if (bmi<25.0){
            System.out.printf("Bình thường");
        }
        else if (bmi<30.0){
            System.out.printf("Thừa cân");
        }
        else {
            System.out.printf("Quá béo");
        }
    }
}
