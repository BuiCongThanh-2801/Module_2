package CaseStudyModule2.Task1.Models;

public class Room extends Services {
    private String FreeService;

    public Room(){

    }

    public Room(String freeService) {
        FreeService = freeService;
    }

    public Room(String ID, String nameService, double area, double rentalCost, int amount, String typeRent, String freeService) {
        super(ID, nameService, area, rentalCost, amount, typeRent);
        FreeService = freeService;
    }

    public String getFreeService() {
        return FreeService;
    }

    public void setFreeService(String freeService) {
        FreeService = freeService;
    }

    @Override
    public String ShowInfo(){
        return "FreeService :" + getFreeService()
                +super.ShowInfo();
    }
}
