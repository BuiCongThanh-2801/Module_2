package Giai_thuat;

import java.util.Scanner;

public class cau2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Mời nhập năm");
        int year=input.nextInt();

        System.out.println("Mời nhập tháng");
        int month=input.nextInt();

        switch (month){
            case 1:


            case 3:

            case 5:

            case 7:

            case 8:

            case 10:

            case 12:
                System.out.println("Tháng "+month + " có 31 ngày"  );
                break;
            case 4:

            case 6:

            case 9:

            case 11:
                System.out.println("Tháng "+month + "có 30 ngày"  );
                break;
            case 2:
                if (year%400==0){
                    System.out.println("Tháng 2 có 29 ngày" );
                    if (year%4==0 && year%100!=0){
                        System.out.println("Tháng 2 có 29 ngày" );
                    }
                }
                else {
                    System.out.println("Tháng 2 có 28 ngày"  );
                }

                break;



        }
    }
}
