class hello extends Thread{
    public void run(){
        System.out.println("I am " + Thread.currentThread().getName());
        System.out.println("My priority is " + Thread.currentThread().getPriority());
    }
}
public class priority_of_thread {
    public static void main(String[] args) {
        hello h1 = new hello();
        h1.setPriority(Thread.MAX_PRIORITY);
        h1.start();

        hello h2 = new hello();
        h2.setPriority(Thread.MIN_PRIORITY);
        h2.start();
    }
}
