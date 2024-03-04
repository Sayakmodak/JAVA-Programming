interface Wifi{
    void getWifi();
}
interface Camera{
    void takingPhoto();
}
class phone{
    void Dialing(){
        System.out.println("Dialing the number...");
    }
    void deleteNumber(){
        System.out.println("Deleting the number...");
    }
}
class SmartPhone1 extends phone implements Wifi, Camera{
    public void getWifi(){
        System.out.println("Getting the wifi network...");
    }
    public void takingPhoto(){
        System.out.println("Taking tha snap...");
    }
    @Override
    public void Dialing(){
        System.out.println("Dialing the number of Harry Brother...");
    }
    
}
public class polymorphism {

    public static void main(String[] args) {
        SmartPhone1 smp = new SmartPhone1();
        smp.getWifi();
        smp.deleteNumber();
        smp.takingPhoto();

        Wifi wfi = new SmartPhone1();
        wfi.getWifi();
        // wfi.takingPhoto();  --> Wifi is an interface and here the reference of Wifi is creating 
    }
}