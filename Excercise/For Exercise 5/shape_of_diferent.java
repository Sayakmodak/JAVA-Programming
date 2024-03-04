                        // radius == length
package Different_Shapes;

class Shape{
    int radius,breadth ;
    Shape(int radius, int breadth){
        this.radius = radius;
        this.breadth = breadth;
    }
    
}
class Rectangle extends Shape{
    Rectangle(int radius, int breadth){
        super(radius,breadth);
    }
    public void area(){
        System.out.println("Area is " + (radius * breadth));
        // return radius * breadth;
    } 
}
class Squre extends Shape{
    Squre(int radius){
        super(radius, radius);
    }
    public int area(){
        return radius * radius;
    }
}
class Cylinder extends Shape{
    Cylinder(int radius, int breadth){
        // this.radius = radius;
        // this.breadth = breadth;
        super(radius, breadth);
    }
    public double area(){
        return 2*Math.PI*radius * breadth + 2*Math.PI*radius * radius;
    }
}
class Sphere extends Shape{
    Sphere(int radius){
        super(radius, radius);
    }
    public double area(){
        return (4 * Math.PI * radius * radius);
    }
}
public class shape_of_diferent {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(2, 5);
        // System.out.println(r);
        r.area();

        Squre s = new Squre(5);
        System.out.println(s.area());
    }
    
}