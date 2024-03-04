class Phone{
    public void showTime(){
        System.out.println("Showing Time...");
    }
    public void On(){
        System.out.println("Turning on the phone");
    }
}
class SmartPhone extends Phone{
    
    public void playMusic(){
        System.out.println("Playuing th music...");
        
    }
    @Override
    public void On(){
        System.out.println("Turning on the Smart phone");
    }
}
public class first_dynamic_method_dispatch{
    public static void main(String[] args) {
    Phone p = new Phone();
    p.On();

    Phone p1 = new SmartPhone();
    p1.showTime();
    p1.On();   // It is crearting the object of SmartPhone()
    }
}
