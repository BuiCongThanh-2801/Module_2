package CaseStudyModule2.Task1.Controllers;

import CaseStudyModule2.Task1.Models.House;
import CaseStudyModule2.Task1.Models.Room;
import CaseStudyModule2.Task1.Models.Services;
import CaseStudyModule2.Task1.Models.Villa;
import CaseStudyModule2.Task1.commons.FuncWriteFileCSV;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class MainController {
    public static void displayMainMenu() {
        System.out.println("1. Add New Service" +
                "\n2. Show Service" +
                "\n3. Exit");
        Scanner input = new Scanner(System.in);
        int selec = input.nextInt();
        switch (selec) {
            case 1:
                showServices();
                addNewService();
                break;
            case 2:
                ShowService();
                break;
            case 3:
                break;
        }
    }

    public static void backMainMenu() {
        System.out.println("\n Enter to continute.... ");
        Scanner input = new Scanner(System.in);
        System.out.println("\n------------------------");
        displayMainMenu();
    }


    public static void addNewService() {
        System.out.println("\n------------------------");
        System.out.println("\n1. Add New Villa" +
                "\n2. Add New House" +
                "\n3. Add New Room" +
                "\n4. Back to menu" +
                "\n5. Exit");
        Scanner input = new Scanner(System.in);
        int selec = input.nextInt();
        switch (selec) {
            case 1:
                addNewVilla();
                break;
            case 2:
                addNewHouse();

                break;
            case 3:
                addNewRoom();

                break;
        }
    }

    public static void ShowService() {
        System.out.println("1. Show All Villa" +
                "\n2. Show All House" +
                "\n3. Show All Room" +
                "\n4. Back to menu" +
                "\n5. Exit");
        Scanner input= new Scanner(System.in);
        int select=input.nextInt();
        switch (select){
            case 1:
                showAllVilla();
            break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
    }

    private static void showServices() {
    }

    private static Services addNewService(Services services) {
        Scanner input = new Scanner(System.in);
        services.setID(UUID.randomUUID().toString().replace("-", ""));
        // Enter Name
        System.out.println("Enter Name Service");
        services.setNameService(input.nextLine());
        // Enter Area
        System.out.println("Enter Area");
        services.setArea(input.nextInt());
        // Enter Rental Cost
        System.out.println("Enter Rental Cost");
        services.setRentalCost(input.nextDouble());
        //Enter Max Number Of Pepple
        System.out.println("Enter Max Number of People");
        services.setNumberOfPeople(input.nextInt());
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter Type Rent: ");
        services.setTypeRent(input2.nextLine());
        return services;
    }

    private static void addNewVilla() {
        Scanner input = new Scanner(System.in);
        Services villa = new Villa();
        villa = addNewService(villa);

        // Enter Room Standard

        System.out.println("Enter Room Standard: ");
        // bây giờ sử dụng Villa nhưng kiểu dữ liệu của nó là Service nên phải ép kiểu
        // Ép kiểu tường mình
        ((Villa) villa).setRoomStandard(input.nextLine());
        // Enter Convenient
        System.out.println("Enter Convenient");
        ((Villa) villa).setConvenient(input.nextLine());
        // Enter  Pool Area

        System.out.println("Enter Pool Area");
        ((Villa) villa).setPoolArea(input.nextDouble());
        // Enter Number of Floor

        System.out.println("Enter Number Of Floor");
        ((Villa) villa).setNumberOfFloors(input.nextInt());

        ArrayList<Villa> ListVilla = new ArrayList<Villa>();
        ListVilla.add((Villa) villa);
        FuncWriteFileCSV.WriteVillaToFileCSV(ListVilla);
        System.out.println("\n Add Villa " + villa.getNameService() + "Successfully");
        backMainMenu();
    }

    private static void addNewHouse() {
        Scanner input = new Scanner(System.in);
        Services house = new House();
        house = addNewService(house);
        System.out.println("");
        System.out.println("Enter Room Standard: ");
        // bây giờ sử dụng Villa nhưng kiểu dữ liệu của nó là Service nên phải ép kiểu
        // Ép kiểu tường mình
        ((House) house).setRoomStandard(input.nextLine());
        // Enter Convenient
        System.out.println("Enter Convenient");
        ((House) house).setConvenient(input.nextLine());

        // Enter Number of Floor
        System.out.println("Enter Number Of Floor");
        ((House) house).setNumberOfFloors(input.nextInt());

        ArrayList<House> ListHouse = new ArrayList<House>();
        ListHouse.add((House) house);
        FuncWriteFileCSV.WriteHouseToFileCSV(ListHouse);
        System.out.println("\n Add House " + house.getNameService() + "Successfully");
        backMainMenu();
    }

    private static void addNewRoom() {
        Scanner input = new Scanner(System.in);
        Services room = new Room();
        room = addNewService(room);
        System.out.println("");
        System.out.println("Enter Free Service: ");
        // bây giờ sử dụng Villa nhưng kiểu dữ liệu của nó là Service nên phải ép kiểu
        // Ép kiểu tường mình
        ((Room) room).setFreeService(input.nextLine());


        ArrayList<Room> ListRoom = new ArrayList<Room>();
        ListRoom.add((Room) room);
        FuncWriteFileCSV.WriteRoomToFileCSV(ListRoom);
        System.out.println("\n Add House " + room.getNameService() + "Successfully");
        backMainMenu();
    }

    private static void showAllVilla() {
        ArrayList<Villa> listVilla= FuncWriteFileCSV.getVillaFromCSV();
        System.out.println(listVilla.size()+"aaaa");
        for (Villa villa: listVilla){
            System.out.println("\n----------------------------");
            System.out.println(villa.ShowInfo());
            System.out.println(villa.getID());
            System.out.println("\n----------------------------");
        }
        Scanner input= new Scanner(System.in);
        backMainMenu();
    }

    private static void showAllHouse() {
    }
    private static void showAllRoom(){

    }
}
