package CaseStudyModule2.Task1.commons;

import java.util.Scanner;

public class FuncValidate {
    private static String regex;
    private static Scanner input;

    // Check Name Valid
    public static boolean checkNameService(String str) {
        regex = "^([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,})([\\s]([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,6}$";
        return str.matches(regex);
    }

    //check Number Double
    public static double checkValidNumberDouble(String content, String errMes) {
        while (true) {
            try {
                input = new Scanner(System.in);
                System.out.println(content);
                return input.nextDouble();
            } catch (Exception ex) {
                System.out.println(errMes);
            }
        }
    }
    //check Number Interger
    public static double checkValidNumberInterger(String content, String errMes) {
        while (true) {
            try {
                input = new Scanner(System.in);
                System.out.println(content);
                return input.nextInt();
            } catch (Exception ex) {
                System.out.println(errMes);
            }
        }
    }

}
