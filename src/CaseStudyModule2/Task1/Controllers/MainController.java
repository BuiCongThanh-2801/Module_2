package CaseStudyModule2.Task1.Controllers;

import CaseStudyModule2.Task1.Models.House;
import CaseStudyModule2.Task1.Models.Room;
import CaseStudyModule2.Task1.Models.Services;
import CaseStudyModule2.Task1.Models.Villa;
import CaseStudyModule2.Task1.commons.FuncValidate;
import CaseStudyModule2.Task1.commons.FuncWriteFileCSV;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class MainController {
    public static void displayMainMenu() {
        System.out.println("\n1. Add New Service" +
                "\n2. Show Service" +
                "\n3. Add New Customers"+
                "\n4. Show Infomation Customers"+
                "\n5. Exit");
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
                addNewCustomer();
                break;
            case 4:
                ShowInfo();
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
        Scanner input = new Scanner(System.in);
        int select = input.nextInt();
        switch (select) {
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
        String content = "";
        String errMes = "";
        Scanner input = new Scanner(System.in);
        services.setID(UUID.randomUUID().toString().replace("-", ""));
        // Enter Name
        System.out.println("Enter Name Service");
        services.setNameService(input.nextLine());
        while (FuncValidate.checkNameService(services.getNameService())) {
            System.out.println("Name Services int invalid. Please try again");
            System.out.println("Enter Name Service");
            services.setNameService(input.nextLine());
        }

        // Enter Area
        content = " Enter Area";
        errMes = "Area is Invalid(Area > 30, Area Must Be A  Double ). Please try again.";
        services.setArea(FuncValidate.checkValidNumberDouble(content, errMes));
        while (services.getArea() <= 30) {
            System.out.println(errMes);
            services.setArea(FuncValidate.checkValidNumberDouble(content, errMes));
        }

        // Enter Rental Cost
        content = " Enter Rental Cost";
        errMes = "Rental Cost is Invalid(Cost > 0, Cost Must Be A  Double ). Please try again.";
        services.setRentalCost(FuncValidate.checkValidNumberDouble(content, errMes));
        while (services.getRentalCost() <= 0) {
            System.out.println(errMes);
            services.setRentalCost(FuncValidate.checkValidNumberDouble(content, errMes));
        }

        //Enter Max Number Of Pepple
        content = " Enter Max Number Of People";
        errMes = "Max Number Of People is Invalid(Cost > 0, Cost Must Be A  Double ). Please try again.";
        services.setNumberOfPeople((int) FuncValidate.checkValidNumberInterger(content, errMes));
        while (services.getNumberOfPeople() <= 0 || services.getNumberOfPeople() >= 20) {
            System.out.println(errMes);
            services.setNumberOfPeople((int) FuncValidate.checkValidNumberInterger(content, errMes));
        }

        // Enter Type Rent
        System.out.println("Enter Type Rent: ");
        services.setTypeRent(input.nextLine());
        while (!FuncValidate.checkNameService(services.getTypeRent())) {
            System.out.println("Type Rent is invalid. Please try again !!!");
            System.out.println("Enter Type Rent");
            services.setTypeRent(input.nextLine());
        }
        return services;
    }

    private static void addNewVilla() {
        String content = "";
        String errMes = "";

        Scanner input = new Scanner(System.in);
        Services villa = new Villa();
        villa = addNewService(villa);

        // Enter Room Standard

        System.out.println("Enter Room Standard: ");
        // bây giờ sử dụng Villa nhưng kiểu dữ liệu của nó là Service nên phải ép kiểu
        // Ép kiểu tường mình

        ((Villa) villa).setRoomStandard(input.nextLine());
        while (!FuncValidate.checkNameService(((Villa) villa).getRoomStandard())) {
            System.out.println("Room Standard is invalid. Please try agian");
            System.out.println("Enter Room Standard: ");
            ((Villa) villa).setRoomStandard(input.nextLine());
        }
        // Enter Convenient
        System.out.println("Enter Convenient");
        ((Villa) villa).setConvenient(input.nextLine());


        // Enter  Pool Area
        content = "Enter Pool Area";
        errMes = "Pool Area is invalid (Area >=30, Area must be a double). Please try again !!!";
        ((Villa) villa).setPoolArea(FuncValidate.checkValidNumberDouble(content, errMes));
        while (((Villa) villa).getPoolArea() <= 30) {
            System.out.println(errMes);
            System.out.println(content);
            ((Villa) villa).setPoolArea(FuncValidate.checkValidNumberDouble(content, errMes));
        }
        // Enter Number of Floor
        content = "Enter Number Of Floor";
        errMes = "Number Of Floor is invalid. Please try again !!! ";
        ((Villa) villa).setNumberOfFloors((int) FuncValidate.checkValidNumberInterger(content, errMes));
        while (((Villa) villa).getNumberOfFloors() <= 0) {
            System.out.println(errMes);
            System.out.println(content);
            ((Villa) villa).setNumberOfFloors((int) FuncValidate.checkValidNumberInterger(content, errMes));
        }

        // tạo 1 ArrayList có tên là ListVilla để lưu trữ thông tin của Villa.
        // muốn nhập vào thông tin mới thì phải lấy hết thông tin cũ ở trong Villa ra khỏi file Villa trước đồ rồi thêm
        // ArrayList có tên là ListVilla

        ArrayList<Villa> ListVilla = new ArrayList<Villa>();
        // sau khi thực hiện xong thì thêm thông tin vào Villa đó

        ListVilla.add((Villa) villa);

        //sau đó thêm ListVilla vào file Villa.CSV
        FuncWriteFileCSV.WriteVillaToFileCSV(ListVilla);
        System.out.println("\n Add Villa " + villa.getNameService() + "Successfully");
        backMainMenu();
    }

    private static void addNewHouse() {
        String content = "";
        String errMes = "";
        Scanner input = new Scanner(System.in);
        Services house = new House();
        house = addNewService(house);
        System.out.println("");
        content = "Enter Room Standard";
        errMes = "Room Standard is invalid. Please try again";
        // bây giờ sử dụng Villa nhưng kiểu dữ liệu của nó là Service nên phải ép kiểu
        // Ép kiểu tường mình
        ((House) house).setRoomStandard(input.nextLine());
        while (!FuncValidate.checkNameService(((House) house).getRoomStandard())) {
            System.out.println(errMes);
            System.out.println(content);
            ((House) house).setRoomStandard(input.nextLine());
        }
        // Enter Convenient
        System.out.println("Enter Convenient");
        ((House) house).setConvenient(input.nextLine());

        // Enter Number of Floor
        content = "Enter Number Of Floor";
        errMes = "Number Of Floor is invalid. Please try again";
        ((House) house).setNumberOfFloors((int) FuncValidate.checkValidNumberInterger(content, errMes));
        while (((House) house).getNumberOfFloors() <= 0) {
            System.out.println(errMes);
            System.out.println(content);
            ((House) house).setNumberOfFloors((int) FuncValidate.checkValidNumberInterger(content, errMes));
        }

        ArrayList<House> ListHouse = new ArrayList<House>();
        ListHouse.add((House) house);
        FuncWriteFileCSV.WriteHouseToFileCSV(ListHouse);
        System.out.println("\n Add House " + house.getNameService() + "Successfully");
        backMainMenu();
    }

    private static void addNewRoom() {
        String content = "";
        String errMes = "";
        Scanner input = new Scanner(System.in);
        Services room = new Room();
        room = addNewService(room);
        content = "Enter Free Service";
        errMes = "Free Service is invalid. Please try agian";

        // bây giờ sử dụng Villa nhưng kiểu dữ liệu của nó là Service nên phải ép kiểu
        // Ép kiểu tường mình
        ((Room) room).setFreeService(input.nextLine());
        while (!FuncValidate.checkNameService(((Room) room).getFreeService())) {
            System.out.println(errMes);
            System.out.println(content);
            ((Room) room).setFreeService(input.nextLine());
        }


        ArrayList<Room> ListRoom = new ArrayList<Room>();
        ListRoom.add((Room) room);
        FuncWriteFileCSV.WriteRoomToFileCSV(ListRoom);
        System.out.println("\n Add House " + room.getNameService() + "Successfully");
        backMainMenu();
    }

    private static void showAllVilla() {
        ArrayList<Villa> listVilla = FuncWriteFileCSV.getVillaFromCSV();
        System.out.println(listVilla.size() + "aaaa");
        for (Villa villa : listVilla) {
            System.out.println("\n----------------------------");
            System.out.println(villa.ShowInfo());
            System.out.println(villa.getID());
            System.out.println("\n----------------------------");
        }
        Scanner input = new Scanner(System.in);
        backMainMenu();
    }

    private static void showAllHouse() {
    }

    private static void showAllRoom() {

    }
    private static void addNewCustomer(){

    }
    private static void ShowInfo(){

    }




}
