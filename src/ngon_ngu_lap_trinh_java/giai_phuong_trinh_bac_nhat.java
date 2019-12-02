package ngon_ngu_lap_trinh_java;

import java.util.Scanner;

public class giai_phuong_trinh_bac_nhat {
    public  static void main(String []args){
        Scanner sr= new Scanner(System.in);
        double a,b,c;
        System.out.printf("a:");
        a=sr.nextDouble();
        System.out.printf("b:");
        b=sr.nextDouble();
        System.out.printf("c:");
        c=sr.nextDouble();
       if (a!=0){
           double answer=(c-b)/a;
           System.out.printf("Equation pass with x=%fl\n ",answer);
       }
       else {
           if (b==0){
               System.out.printf(" The solution is al x!");
           }
           else {
               System.out.printf("No sulotion");
           }
       }

    }
}
