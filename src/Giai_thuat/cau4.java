package Giai_thuat;

import java.util.Scanner;

public class cau4 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n=input.nextInt();
        float sum=0;
        float gt=0;
        float summ=0;
        for (int i=1;i<n;i++){
            summ+=gt;
            for (int j=0;i<j;j++){
                gt+=((float)(Math.pow(-1.f,j))*(1.f/j));
            }
        }
        System.out.println(sum=15+summ);
    }
}
