class Squre{
    int length ;
    public Squre(){
        System.out.println("I am non param Constructor");
    }

    public Squre(int length){
        System.out.println("I am param Constructor");
        this.length = length;
    }
    public double squreArea(){
        return length * length;
    }
}
class Rectangle extends Squre{
    int breadth;
    public Rectangle(int breadth,int length){
        super(length); // BTS --> this.length = length;
        this.breadth = breadth;
    }
    public double rectangleArea(){
        return length * breadth;
    }
}
public class rectangle_squre {
    public static void main(String[] args) {
    Squre sq = new Squre(5); 
    System.out.println(sq.squreArea()); 

    Rectangle rect = new Rectangle(5,5);  
    System.out.println(rect.rectangleArea());
    }
    
}
