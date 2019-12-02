package mang_va_phuong_thuc_trong_java;

public class PtBac2 {
    private double a;
    private double b;
    private double c;
    // Trường dữ liệu a,b,c đại diện cho 3 hệ số
    public PtBac2(){

    }

    public PtBac2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    //Phương thức khởi tạo với 3 tham số để khởi tạo các giá trị cho a, b và c.


    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    //Phương thức gettter cho a, b và c

    public double getDiscriminant(){
        return this.b*this.b-4*this.a*this.c;
    }

    public double getRoot1(){
        return (-this.b + Math.sqrt(this.getDiscriminant()))/ (2*this.a);
    }
    public double getRoot2(){
        return (-this.b - Math.sqrt(this.getDiscriminant()))/ (2*this.a);
    }
}

