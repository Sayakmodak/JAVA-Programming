class myThread1 implements Runnable{
    public void run(){
        int i=0 ;
        while (i<50) {
            System.out.println("Thread 1");
        }
        i++;
    }
}
class myThread2 implements Runnable{
    public void run(){
        int i=0 ; 
        while (i<50) {
            System.out.println("Thread 2");
        }
        i++;
    }
}
public class threading_using_runnable_implements {
    public static void main(String[] args) {
        myThread1 bullet1 = new myThread1();
        Thread gun1 = new Thread(bullet1);

        myThread2 bullet2 = new myThread2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}
