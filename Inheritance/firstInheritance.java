class Base{
    int x;
    public int getX() {
        return x;
    }
    public int setX(int x) {
       return this.x = x;
    }

}
class Derived extends Base{
    int y;
    public int getY() {
        return y;
    }
    public int setY(int y){
        return this.y = y;
    }

}
public class firstInheritance {

    public static void main(String[] args) {
    Base b = new Base();
    b.setX(5);
    System.out.println(b.getX());
    


    Derived d = new Derived();
    d.setX(53);
    System.out.println(d.getX());
    }
}