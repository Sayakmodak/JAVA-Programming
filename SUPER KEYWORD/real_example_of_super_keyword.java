// Calculate the area of squre, rectangle, sphere, cylinder
// radius == length
// breadth == height
package Shapes;
class shape{
    int radius, breadth;
    shape(int radius,int breadth){
        this.radius = radius;
        this.breadth = breadth;
    }
}
class rectangle extends shape{
    rectangle(int radius, int breadth){
        super(radius,breadth);
    }
    public int area(){
       return radius * breadth;
    } 
}
class squre extends shape{
    squre(int radius){
        super(radius,radius);
    }
    public int area(){
       return radius * radius;
    }
}
class sphere extends shape{
    sphere(int radius, int breadth){
        super(radius, breadth);
    }
    public double area(){
        return (4 * Math.PI * radius * radius);
    }
}
class cylinder extends shape{
    cylinder(int radius, int breadth){
        super(radius, breadth);
    }
    public double area(){
        return 2*Math.PI*radius * breadth + 2*Math.PI*radius * radius;
    }
}
class real_example_of_super_keyword{
    public static void main(String[] args) {
        cylinder c = new cylinder(5,10);
        System.out.println(c.area());
    }
}
