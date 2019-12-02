package Giai_thuat;

import java.util.Scanner;

public class cau3 {
    public static void main(String[] args) {

        double sum=0;
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        for (int i=1;i<=n;i++){
            sum+=(1.f/i);
        }
        System.out.println(sum);
    }
}
