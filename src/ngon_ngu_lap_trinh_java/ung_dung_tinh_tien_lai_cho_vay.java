package ngon_ngu_lap_trinh_java;

import java.util.Scanner;

public class ung_dung_tinh_tien_lai_cho_vay {
    public static void main(String[] args) {
        double money=1.0;
        int month= 1;
        double interset_rate=1.0;
        Scanner input= new Scanner(System.in);
        System.out.printf("Nhập số lượng tiền cho vay");
        money=input.nextDouble();
        System.out.printf("Nhập tỉ lệ lãi xuất theo tháng");
        interset_rate=input.nextDouble();
        System.out.printf("Nhập số tháng cho vay");
        month=input.nextInt();
        double total_interset=0;
        for (int i=0;i<month;i++){
            total_interset=money*(interset_rate/100)/12*month;
        }
        System.out.printf("Lãi xuất "+total_interset );
    }
}
