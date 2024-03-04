class Sphere{
    int r;
    //int h=5;
    public Sphere(){
        this.r = 5;
    }
    public Sphere(int radius){
        this.r = radius;
    }
    public double surfaceArea(){
        return 4 * Math.PI * r * r;
    }
    public double volume(){
        return (4/3) * Math.PI * r * r * r;
    }
}
public class ps_3_using_constructor {
    public static void main(String[] args) {
    Sphere sp = new Sphere(10);
    //System.out.println(sp.h);
    System.out.println(sp.r);    
    System.out.println(sp.surfaceArea());
    System.out.println(sp.volume());
    }
}
