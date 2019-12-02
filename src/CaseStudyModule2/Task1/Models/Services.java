package CaseStudyModule2.Task1.Models;

public abstract class Services {
    private String ID;
    private String NameService;
    private double Area;
    private double RentalCost;
    private int NumberOfPeople;
    private String typeRent;


    public Services(){

    }

    public Services(String ID, String nameService, double area, double rentalCost, int numberOfPeople, String typeRent) {
        this.ID = ID;
        NameService = nameService;
        Area = area;
        RentalCost = rentalCost;
        NumberOfPeople = numberOfPeople;
        this.typeRent = typeRent;
    }


    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNameService() {
        return NameService;
    }

    public void setNameService(String nameService) {
        NameService = nameService;
    }

    public double getArea() {
        return Area;
    }

    public void setArea(double area) {
        Area = area;
    }

    public double getRentalCost() {
        return RentalCost;
    }

    public void setRentalCost(double rentalCost) {
        RentalCost = rentalCost;
    }

    public int getNumberOfPeople() {
        return NumberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        NumberOfPeople = numberOfPeople;
    }

    public String getTypeRent() {
        return typeRent;
    }

    public void setTypeRent(String typeRent) {
        this.typeRent = typeRent;
    }

    public String ShowInfo(){
        return  "\n ID" + getID()+
                "\n NameService: " +getNameService()+
                "\n Area :" + getArea()+
                "\n RentalCost :" + getRentalCost()+
                "\n Amount :" + getNumberOfPeople()+
                "\n typeRent :" + getTypeRent();

    }


}
