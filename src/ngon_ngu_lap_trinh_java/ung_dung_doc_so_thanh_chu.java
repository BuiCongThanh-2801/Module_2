package ngon_ngu_lap_trinh_java;

import java.util.Scanner;

public class ung_dung_doc_so_thanh_chu {
    public static void main(String[] args) {
        Scanner sr= new Scanner(System.in);
        System.out.printf("Nhập số ");
        int i=sr.nextInt();
        switch (i){
            case 0:
                System.out.printf("Không");
                break;
            case 1:
                System.out.printf("một");
                break;
            case 2:
                System.out.printf("hai");
                break;
            case 3:
                System.out.printf("ba");
                break;
            case 4:
                System.out.printf("bốn");
                break;
            case 5:
                System.out.printf("năm");
                break;
            case 6:
                System.out.printf("sáu");
                break;
            case 7:
                System.out.printf("bảy");
                break;
            case 8:
                System.out.printf("tám");
                break;
            case 9:
                System.out.printf("chín");
                break;
            default:
                System.out.printf("số vượt quá khả năng");
        }
        switch (i){
            case 10:
                System.out.printf("");
                break;
            case 11:
                System.out.printf("một");
                break;
            case 12:
                System.out.printf("hai");
                break;
            case 13:
                System.out.printf("ba");
                break;
            case 14:
                System.out.printf("bốn");
                break;
            case 15:
                System.out.printf("năm");
                break;
            case 16:
                System.out.printf("sáu");
                break;
            case 17:
                System.out.printf("bảy");
                break;
            case 18:
                System.out.printf("tám");
                break;
            case 19:
                System.out.printf("chín");
                break;
            default:
                System.out.printf("số vượt quá khả năng");
        }
    }
}
