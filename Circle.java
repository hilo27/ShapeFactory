
package javaapplication17;

public class Circle extends Shape{
    
    private double r;

    public Circle(double x, double y, double r, String name) {
        super(x, y, name);
        setRadius(r);
    }

    public double getRadius() {
        return r;
    }

    public final void setRadius(double r) {
        if (r<0) r=-r;
        this.r = r;
    }

    @Override
    public String toString() {
        return super.toString() + ", r=" + r;
    }
        
    @Override
    public double area(){
        return Math.PI * r *r;
    }
    
}
