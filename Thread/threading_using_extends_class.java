class MyThread1 extends Thread{
    @Override
    public void run(){
        // code that we want to get executed by threading
        int i=0;
        while (i<=100) {
            System.out.println("This is thread 1");
        }
        i++;
    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while (i<=100) {
            System.out.println("This is thread 2");
        }
        i++;
    }
}
public class threading_using_extends_class {

    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        t1.start();

        MyThread2 t2 = new MyThread2();
        t2.start();
    }
}