package ngon_ngu_lap_trinh_java;

import java.util.Scanner;

public class hien_thi_cac_so_nguyen_to_nho_hon_100 {
    public static void main(String[] args) {
        for  (int snt=2; snt<=100;snt++){
            int demuoc=0;
            double csnt=Math.sqrt(snt);
                for (int i=2; i<csnt;i++){
                  if (snt%i==0){
                     demuoc++;
                  }
                }
                if (demuoc==0){
                    System.out.printf( snt+" ");
            }
        }
    }
}
//        int snt=2;
//        while(snt<100){
//            int demuoc=0;
//            double csnt=Math.sqrt(snt);
//            for (int i=1;i<csnt;i++){
//                if (snt%i==0){
//                    demuoc++;
//                }
//            }
//            if (demuoc==1){
//                System.out.printf(snt+ " ");
//            }
//            snt++;
//        }
//    }
//}
