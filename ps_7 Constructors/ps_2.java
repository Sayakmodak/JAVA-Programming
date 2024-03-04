class Cylinder{
    int radius;
    int height;

    public int getRadius() {
        return radius;
    }
    public int setRadius(int radius){
        return this.radius = radius;
    }

    public int getHeight(){
        return height;
    }
    public int setHeight(int height){
        return this.height = height;
    }

    public double surfaceArea(){
        return 2*Math.PI*radius*height + 2*Math.PI*radius*2 ;
    }
    // Constructor used to avoid setters and getters
    
    /*public Cylinder(int radius, int height){
        this.radius = radius ;
        this.height = height ;
    }*/
    public double volume(){
        return Math.PI*radius*radius*height;
    }
}
public class ps_2 {
   
    public static void main(String[] args) {
    Cylinder cy = new Cylinder();

    cy.setRadius(10);
    System.out.println("Radius of the cylinder is " + cy.getRadius());

    cy.setHeight(20);
    System.out.println("Radius of the cylinder is " + cy.getHeight());

    System.out.println("Surface Area is " + cy.surfaceArea());
    System.out.println("Volume is " + cy.volume());

    }
}
