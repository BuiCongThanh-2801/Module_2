package CaseStudyModule2.Task1.Models;

public class Villa extends Services {
    private String RoomStandard;
    private String Convenient;
    private int NumberOfFloors;
    private double PoolArea;

    public Villa() {
    }

    public Villa(String roomStandard, String convenient, int numberOfFloors, double poolArea) {
        RoomStandard = roomStandard;
        Convenient = convenient;
        NumberOfFloors = numberOfFloors;
        PoolArea = poolArea;
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

    public double getPoolArea() {
        return PoolArea;
    }

    public void setPoolArea(double poolArea) {
        PoolArea = poolArea;
    }

    @Override
    public String ShowInfo() {
        return "\n Room Standard" + getRoomStandard() +
                "\n Convenient" + getConvenient() +
                "\n Number Of Floor" + getNumberOfFloors() +
                "\n PoolArea" + getPoolArea() +
                super.ShowInfo();
    }
}
