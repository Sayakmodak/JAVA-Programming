class parent extends Thread{
   
    public void run(){
        System.out.println("I am " + Thread.currentThread().getName());
        System.out.println("My priority is " + Thread.currentThread().getPriority());
    }
}
public class thread_priority {
    public static void main(String[] args) {
        parent p1 = new parent();
        p1.setPriority(Thread.MAX_PRIORITY);
        p1.start();

        parent p2 = new parent();
        p2.setPriority(Thread.MIN_PRIORITY);
        p2.start();
    }
}