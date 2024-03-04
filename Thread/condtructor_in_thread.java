class myThread extends Thread{
    myThread(String name){
        super(name);    // this.name = name;
    }
    public void run(){
        System.out.println("I am a thread");
    }
}

public class condtructor_in_thread {
    public static void main(String[] args) {
        myThread m = new myThread("Chintu");
        m.start();
        System.out.println(m.getName());
        System.out.println(m.getId());
    }   
}
