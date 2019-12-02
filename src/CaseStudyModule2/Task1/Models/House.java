package CaseStudyModule2.Task1.Models;

public class House extends Services {
    private String RoomStandard;
    private String Convenient;
    private int NumberOfFloors;

    public House(){

    }

    public House(String roomStandard, String convenient, int numberOfFloors) {
        RoomStandard = roomStandard;
        Convenient = convenient;
        NumberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return RoomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        RoomStandard = roomStandard;
    }

    public String getConvenient() {
        return Convenient;
    }

    public void setConvenient(String convenient) {
        Convenient = convenient;
    }

    public int getNumberOfFloors() {
        return NumberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        NumberOfFloors = numberOfFloors;
    }


    public String ShowInfo(){
        return "Room Standard" + getRoomStandard()+
                "Convenient" + getConvenient()+
                "Number Of Floor" + getNumberOfFloors()+
                super.ShowInfo();
    }
}
