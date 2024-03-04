interface Bycicle{
    void applyBrake();
    void speedUp();
} 
class AvonCycle{
    void applyBrake(int b){
        System.out.println("Brake Applied by " + b);
    }
    void speedUp(int spd){
        System.out.println("Speed Up the bicycle by " + spd);
    }
}
public class intefacees{
    public static void main(String[] args) {
        AvonCycle avn = new AvonCycle();
        avn.applyBrake(10);
        avn.speedUp(50);
    }
}