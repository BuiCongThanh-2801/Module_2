package ngon_ngu_lap_trinh_java;

import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        Scanner sr= new Scanner(System.in);
        System.out.printf("Nhập điểm học sinh");
        double score=sr.nextDouble();
        String grade;
        if (score>9){
            System.out.printf("Excelled");
        }
        else if (score<4){
            System.out.printf("Failed");
        }
        else {
            if (score>=8.5){
               grade="A";
            }
            else if (score>=7.0){
                grade="B";
            }
            else if (score>=5.5){
                grade="C";
            }
            else if (score>=4.0){
                grade="D";
            }
            else {
                grade="F";
            }
            System.out.printf("Passed");
        }
        if (score<4.0) {
            ;
            System.out.printf("       You have to take this course again");
            }
        else {
            System.out.printf(" Congratulation !!!");
            System.out.printf("  You passed this course");
        }
        }
    }