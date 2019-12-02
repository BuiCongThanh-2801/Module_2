package CaseStudyModule2.Task1;

        import CaseStudyModule2.Task1.Controllers.MainController;
        import CaseStudyModule2.Task1.Models.Services;
        import CaseStudyModule2.Task1.Models.Villa;

        import java.util.Scanner;
        import java.util.UUID;

public class Main {
    public static void main(String[] args) {


//
//        Scanner input= new Scanner(System.in);
//        Services villa= new Villa();
//        villa.setID(UUID.randomUUID().toString().replace("-", ""));
//        System.out.println("Enter Name Service");
//        villa.setNameService(input.nextLine());
//        System.out.println("Enter Area ");
//        villa.setArea(input.nextInt());
//        System.out.println("Enter Rental Cost");
//        villa.setRentalCost(input.nextDouble());
//        System.out.println("Enter Number Of People");
//        villa.setNumberOfPeople(input.nextInt());
        MainController mainController= new MainController();
        mainController.displayMainMenu();



    }
}
