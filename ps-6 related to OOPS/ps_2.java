class Squre{
    int side ;
    public void area(){
        System.out.println("The area is " + side * side);
    }
    public void perimetre(){
        System.out.println("The perimetre is " + 4 * side);
    }
}
class Rectangle{
    int length;
    int breadth;
    public void area(){
        System.out.println("The area is " + length * breadth);
    }
    public void perimetre(){
        System.out.println("The perimetre is " + 2 * (length + breadth));
    }
    public void changeLength(int len){
        length = len;
    }
}
public class ps_2 {
    public static void main(String[] args) {
        Squre sq = new Squre();
        sq.side = 5;
        sq.area();
        sq.perimetre();

        Rectangle rect = new Rectangle();
        rect.length = 5;
        rect.breadth = 5;
        rect.area();
        rect.perimetre();

        // After changing 
        rect.changeLength(10);
        System.out.print("After changing ");
        rect.area();
    }
}
