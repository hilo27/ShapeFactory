
package javaapplication17;

public class Rect extends Shape{

    private double a,b;

    public Rect(double a, double b) {
        super(0,0, "Rectangle");
        setA(a);
        setB(b);
//        this.a = a;
//        this.b = b;
    }
    
    public Rect(double x, double y, String name) {
        super(x, y, name); //super обращение к родительскому классу
        setA(1);
        setB(1);
    }

    public Rect(double x, double y, double a, double b, String name) {
        super(x, y, name);
        setA(1);
        setB(1);
    }
    
    

    public double getA() {
        return a;
    }

    public final void setA(double a) { //чтобы нельзя было переопределить
        if(a<0)a=-a;
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public final void setB(double b) { //чтобы нельзя было переопределить
        if(b<0)b=-b;
        this.b = b;
    }

    @Override
    public String toString() {
        return super.toString()+ " a=" + a + ", b=" + b;
    }
    
    @Override
    public double area() { //можно делать return без типа данных
        return a*b;
    }
    
}
