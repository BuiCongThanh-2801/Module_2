package ngon_ngu_lap_trinh_java;

import java.util.Scanner;

public class tinh_so_ngay_trong_thang {
    public static void main(String[] args) {
        Scanner sr= new Scanner(System.in);
        System.out.printf("Which month that you want to count day? ");
        int month = sr.nextInt();
        switch (month){
            case 2:
                System.out.printf("The month '2' has 28 or 29 day ");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.printf("The month" + month +"has 31 day");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.printf("The month" + month +" has 30 day");
            default:
                System.out.printf("Invalid input");
                break;
        }
    }
}
