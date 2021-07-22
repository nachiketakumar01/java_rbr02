package oopquestion01;
public class Triangle {
    private double side01;
    private double side02;
    private double side03;
    Triangle (){
        side01=side02=side03=1.0;
    }
    Triangle(double side01,double side02,double side03){
        this.side01=side01;
        this.side02=side02;
        this.side03=side03;
    }
    public double getside01(){
        return side01;
    }
    public double getside02(){
        return side02;
    }
    public double getside03(){
        return side03;
    }
    public double area(){
        double s=(side01 + side02 + side03)/2;
        return (Math.sqrt(s*(s-side01)*(s-side02)*(s-side03)));
    }
    public double perimeter(){
        return (side01+side02+side03);
    }
    public String tostring(){
        return "Triangle side01: "+side01+"side02: "+side02+"side03: "+side03;
    }
}
