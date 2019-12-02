package ngon_ngu_lap_trinh_java;

import java.util.Scanner;

public class thiet_ke_menu_cho_ung_dung {
    public static void main(String[] args) {
        int choice=1;
        Scanner input= new Scanner(System.in);
        while (choice!=0){
            System.out.printf("Menu" +
                "\n1.  Draw the triangle" +
                "\n2. Draw the square" +
                "\n3. Draw the rectangle" +
                "\n0. Exit");
        choice=input.nextInt();
        switch (choice){
            case 1:
                System.out.printf("Draw the triangle" +
                        "\n ******" +
                        "\n *****" +
                        "\n ****" +
                        "\n ***" +
                        "\n **" +
                        "\n *");
                break;
            case 2:
                System.out.printf("Draw the square" +
                        "\n * * * * * *" +
                        "\n * * * * * *" +
                        "\n * * * * * *" +
                        "\n * * * * * *" +
                        "\n * * * * * *" +
                        "\n * * * * * *" );
                break;
            case 3:
                System.out.printf("Draw the rectangle" +
                        "\n * * * * * *" +
                        "\n * * * * * *" +
                        "\n * * * * * *");
                 break;
            case 0:
                System.exit(0);
            default:
                System.out.printf("No choice");
        }}
    }
}
