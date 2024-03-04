package CodeWithHarry;

abstract class TelePhone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class SmartPhone {
    void music(){
        System.out.println("Playing Music...");
    }
    void game(){
        System.out.println("Playing game...");
    }
    void camera(){
        System.out.println("Taking pictures...");
    }
}
class Phone extends SmartPhone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void lift(){
        System.out.println("Lifting...");
    }
    public void disconnect(){
        System.out.println("Disconnected...");
    }
}
public class ps_3 {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.music();
        p.ring();
        // We can not create an object of abstract class
        SmartPhone s = new SmartPhone();
        //s.ring();
        s.game();
    }
}
