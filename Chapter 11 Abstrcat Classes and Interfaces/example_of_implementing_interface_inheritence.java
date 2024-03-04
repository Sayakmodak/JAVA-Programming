interface myCamera{
    void takeSnap();
    void recordVideo();  
    default void takePanaroma(){  // --> It is accessible
        System.out.println("Taking panaroma pictures");
    }
}
interface wifi{
    void getNetworks();
}
class myCellphone{
    void callNumber(){
        System.out.println("Calling...");
    }
    void pickCall(){
        System.out.println("Pick the call...");
    }
}

class mySmartPhone extends myCellphone implements myCamera, wifi{
    public void takeSnap(){
        System.out.println("Taking snap...");
    }
    public void recordVideo(){
        System.out.println("Recording video...");
    }
    public void getNetworks(){
        System.out.println("Fetching the network list...");
        String arr[] = {"Raja", "Raju"};
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    @Override
    void callNumber(){
        System.out.println("Calling the phone...");
    }
}

public class example_of_implementing_interface_inheritence {

    public static void main(String[] args) {
        mySmartPhone myS = new mySmartPhone();
        myS.takeSnap();
        myS.getNetworks();
        myS.callNumber();
        myS.takePanaroma();
    }
}