class Sphere{
    int radius;
    public int getRadius(){
        return radius;
    }
    public int setRadius(int radius){
        return this.radius = radius;
    }
    public double surfaceArea(){
        return 4* Math.PI * radius * radius; 
    }
}
public class ps_3 {
    public static void main(String[] args) {
    Sphere sp = new Sphere();
    sp.setRadius(10);
    System.out.println("Radius is " + sp.getRadius());
    System.out.println(sp.radius);

    System.out.println(sp.surfaceArea());
    }
}
