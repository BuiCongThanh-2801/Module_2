package ngon_ngu_lap_trinh_java;

import java.util.Scanner;

public class kiem_tra_so_nguyen_to {
    public static void main(String[] args) {
        Scanner sr= new Scanner(System.in);
        System.out.printf(" Enter the number: ");
        int number= sr.nextInt();
        if (number<2){
            System.out.printf(number+" Is not a prime");
        }
        else {
            int i=2;
            boolean check=true;
            while (i<=Math.sqrt(number)){
                if (number%i==0){
                    check=false;
                    break;
                }
                i++;
            }
            if (check){
                System.out.printf(number+" Number is a prime");
            }
            else{
                System.out.printf(number+" Is not a prime");
            }
        }
    }
}
