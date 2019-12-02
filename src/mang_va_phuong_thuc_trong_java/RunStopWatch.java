package mang_va_phuong_thuc_trong_java;

import java.util.Random;
import java.util.Scanner;

public class RunStopWatch {
    public static void main(String[] args) {
        StopWatch stopWatch= new StopWatch();
        // khởi tạo đối tượng
        stopWatch.start();
        int [] arr= new int[100000];
        for(int i=0;i<arr.length;i++){
            Random rd= new Random();
            int number =rd.nextInt();
        }
        stopWatch.stop();
        System.out.println("Thời gian thực thi  "  +stopWatch.getElapsedTime());
    }
}
