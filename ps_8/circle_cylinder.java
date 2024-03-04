class Circle{
    int radius;
    /*public int getRadius(){
        return this.radius;
    }
    public int setRadius(int radius) {
       return this.radius = radius;
    }*/
    public Circle(int radius){
        this.radius = radius;
    }
    public double area(){
        return 4*Math.PI*radius*radius;
    }
}


class Cylinder{
    int height;
    int radius;
    public int getHeight() {
        return height;
    }
    public int setHeight(int height){
        return this.height = height;
    }
    public int getRadius() {
        return radius;
    }
    public int setRadius(int radius) {
       return this.radius = radius;
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }
}
public class circle_cylinder {
    public static void main(String[] args) {
      
        /*Circle c = new Circle();
        c.setRadius(5);
        System.out.println("Radius is " + c.getRadius());
        System.out.println(c.area());*/

        // Using Constructor
        Circle c = new Circle(5);
        System.out.println("Radius is " + c.radius);
        System.out.println(c.area());
    }
}
