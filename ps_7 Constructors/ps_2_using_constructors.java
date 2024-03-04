class myCylinder{
    int r;
    int h;
    public myCylinder(int r,int h){
        this.r = r;
        this.h = h;
    }
    public myCylinder(){
        this.r = 5;
        this.h = 4;
    }
    
    public double surfaceArea(){
        return 2*Math.PI*r*h + 2*Math.PI*r*2 ;
    }
    public double volume(){
        return Math.PI*r*r*h;
    }
}
public class ps_2_using_constructors {
    public static void main(String[] args) {
    //myCylinder myC = new myCylinder(10, 20);
    myCylinder myC = new myCylinder();

    System.out.println("Radius of the surfce area is " + myC.r);
    System.out.println("Height of the surfce area is " + myC.h);


    System.out.println(myC.surfaceArea());  
    System.out.println(myC.volume());  
    }
}
