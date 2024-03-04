interface Bicycle{
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface Bicycle2{
    void blowHorn1();
    void blowHorn2();
}
// Interface
class AvonCycle implements Bicycle, Bicycle2{
    // Must have to create the above methods in child class
    public void applyBrake(int decrement){
        System.out.println("The speed of the cycle is decremented by " + decrement);
    }
    public void speedUp(int increment){
        System.out.println("The speed of the cycle is incremented by " + increment);
    }
    public void blowHorn1(){
        System.out.println("Horn maro 1");
    }
    public void blowHorn2(){
        System.out.println("Horn maro 2");
    }
}
public class first_interface {
    public static void main(String[] args) {
    AvonCycle avc = new AvonCycle();
    avc.applyBrake(1);
    avc.speedUp(5);
    avc.blowHorn1();
    avc.blowHorn2();
    }
}
