package ngon_ngu_lap_trinh_java;

import java.util.Scanner;

public class kiem_tra_nam_nhuan {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int year;
        System.out.printf("Nhập năm ");
        year=scanner.nextInt();
        if (year%4==0){
            if (year%100==0){
                if (year%400==0){
                    System.out.printf("%d là năm nhuận" , year);
                }
                else {
                    System.out.printf("%d không phải năm nhuận" , year);
                }
            }else {
                System.out.printf("%d là năm nhuận" , year);
            }
        }else {
            System.out.printf("%d không phải là năm nhuận" ,year);
        }
    }
}
