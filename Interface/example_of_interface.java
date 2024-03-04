interface Vehicle{
    void changeGear(int a);
    void speedUp(int b);
    void speedDown(int c);
}
class Bicycle implements Vehicle{
    int gear;
    int speed;
    public void changeGear(int a){
        gear = a;
    }
    public void speedUp(int increment){
        speed = speed + increment;
    }
    public void speedDown(int decrement){
        speed = speed - decrement;
    }
    public void printState(){
        System.out.println("The gear is now " + gear + " The speed is now " + speed);
    }
}
class Bike implements Vehicle{
    int gear;
    int speed;
    public void changeGear(int x){
        gear = x;
    }
    public void speedDown(int decrement){
        speed = speed - decrement;
    }
    public void speedUp(int increment){
        speed = speed + increment;
    }
    public void printState(){
        System.out.println("The gear is now " + gear + " The speed is now " + speed);
    }
}
public class example_of_interface{
    public static void main(String[] args) {
        Bicycle by = new Bicycle();
        by.changeGear(3);
        by.speedUp(50);
        by.speedDown(10);
        by.printState();

        Bike hero = new Bike();
        hero.changeGear(5);
        hero.speedDown(10);
        hero.speedUp(50);
        hero.printState();
    }
}