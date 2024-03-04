class myCircle{
    public int radius;
    public myCircle(int radius){
        this.radius = radius;
        System.out.println("I am param constructor");
    }
    public double area(){
        return 4*Math.PI*radius*radius;
    }
}
class myCylinder extends myCircle{
    public int height;
   
    public myCylinder(int h,int r){
        super(r);  // BTS --> this.radius = r;
        this.height = h;
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }
}
public class ps_1 {

    public static void main(String[] args) {
        myCircle myCir = new myCircle(5);
        System.out.println(myCir.area());

        myCylinder myCyl = new myCylinder(2, 4);
        System.out.println(myCyl.volume());
    }
}