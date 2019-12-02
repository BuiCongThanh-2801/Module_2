package CaseStudyModule2.Task1.commons;

import java.util.Scanner;

public class FuncValidate {
    private static String regex;
    private static Scanner input;

    // Check Name Valid
    public static boolean checkNameService(String str){
        regex="^ ([\\p{Lu}]|([\\p{Lu}][\\p{Ll}]{1,}))([\\s]([\\p{Lu}][\\p{Ll}]{1,10})){0,6}$";
        return str.matches(regex);
    }
}
