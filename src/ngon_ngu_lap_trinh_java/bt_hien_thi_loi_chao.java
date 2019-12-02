package ngon_ngu_lap_trinh_java;

import java.util.Scanner;

public class bt_hien_thi_loi_chao {
    public static void main(String[] args) {
        Scanner sr= new Scanner(System.in);
        System.out.printf("Nhập tên người dùng");
        String name= sr.nextLine();
        System.out.printf("Xin Chào " + name);
    }
}
