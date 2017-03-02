
package javaapplication17;

public class JavaApplication17 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Rect r1 = new Rect(-1, -2, 5, 9, "Rectangle 1");
        
        System.out.println(r1);
        System.out.println(r1.getName()+" area= "+r1.area());
        //System.out.println(new Rect(2,5));
        
        Shape[] shapes = {r1,new Rect(2, 3, 3, 2, "Rectangle 2"), 
                             new Circle(3, -1, 10, "Circle 1"), 
                             new Rect(8, 3, 2, 8, "Rectangle 3")};
        
        for(Shape shi : shapes) System.out.println(shi);
        
        printAreas(shapes);
        
        for (Shape obj : shapes) System.out.println(obj.area());
    }

    private static void printAreas(Shape[] shapes) {
       
        for(Shape obj : shapes){
         if (obj instanceof Rect){
             Rect r = (Rect) obj;
             System.out.println(r.getName()+ " area = " + r.area());
         } 
         else if (obj instanceof Circle) {
             //делает тоже самое что и предыдущий if
             System.out.println(((Circle)obj).getName() + " area " + ((Circle)obj).area());
         }
        }
        
    }
    
}
