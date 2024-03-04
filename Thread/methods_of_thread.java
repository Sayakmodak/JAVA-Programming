class myThr1 extends Thread{
    public void run(){
        int i=0;
        while(i<100){
            System.out.println("Thread 1");
            i++;
        }
        
    }
}
class myThr2 extends Thread{
    public void run(){
        int i=0;
        while(i<100){
            System.out.println("Thread 2");
            i++;
        }
        
    }
}
public class methods_of_thread {
    public static void main(String[] args) {
        myThr1 mt1 = new myThr1();
        myThr2 mt2 = new myThr2();
        mt1.start();
        try{
            mt1.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        mt2.start();
    }
}
