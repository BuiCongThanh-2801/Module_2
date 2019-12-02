package ngon_ngu_lap_trinh_java;

import java.util.Scanner;

public class tim_uoc_chung_lon_nhat {
    public static void main(String[] args) {
        int a,b;
        Scanner nhap= new Scanner(System.in);
        System.out.printf("Nhập số a");
        a=nhap.nextInt();
        System.out.printf("Nhập số b");
        b=nhap.nextInt();
        a= Math.abs(a);
        b=Math.abs(b);
        if (a==0 || b==0){
            System.out.printf("No greatest common factor");
        }
        while (a!=b){
            if (a>b){
                a=a-b;
            }
            else {
                b=b-a;
            }
            System.out.printf("Greatest common factor: " +a);
        }

    }
}
