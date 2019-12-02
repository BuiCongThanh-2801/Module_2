package CaseStudyModule2.Task1.Models;

public class Customers {
    private String IdCustomer;
    private String NameCustomer;
    private String Brithday;
    private String Gender;
    private String Email;
    private String TypeCustomers;
    private String Address;
    private int IdCard;
    private String phoneNumber;
    private Services services;

    public Customers(String idCustomer, String nameCustomer, String brithday, String gender, String email, String typeCustomers, String address, int idCard, String phoneNumber, Services services) {
        IdCustomer = idCustomer;
        NameCustomer = nameCustomer;
        Brithday = brithday;
        Gender = gender;
        Email = email;
        TypeCustomers = typeCustomers;
        Address = address;
        IdCard = idCard;
        this.phoneNumber = phoneNumber;
        this.services = services;
    }

    public Customers() {
    }

    public String getIdCustomer() {
        return IdCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        IdCustomer = idCustomer;
    }

    public String getNameCustomer() {
        return NameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        NameCustomer = nameCustomer;
    }

    public String getBrithday() {
        return Brithday;
    }

    public void setBrithday(String brithday) {
        Brithday = brithday;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getTypeCustomers() {
        return TypeCustomers;
    }

    public void setTypeCustomers(String typeCustomers) {
        TypeCustomers = typeCustomers;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getIdCard() {
        return IdCard;
    }

    public void setIdCard(int idCard) {
        IdCard = idCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }

    public String ShowInfo(){
        return "\n NameCustomer" + this.getNameCustomer()+
                "\n IdCard" + this.getIdCard()+
                "\n Gender" + this.getGender()+
                "\n IdCustomer" + this.getIdCustomer()+
                "\n Phone" + this.getPhoneNumber()+
                "\n Email" + this. getEmail()+
                "\n Type " +this.getTypeCustomers()+
                "\n Address" + this.getAddress()+
                "\n Brithday" + this.getBrithday();
    }

    public String ShowInfoCustomerService(){
        return ShowInfo() + this.getServices();
    }
}
