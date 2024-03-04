class myThr1 extends Thread{
    public void run(){System.out.println("My priority is " + Thread.currentThread().getPriority());
    System.out.println("My name is " + Thread.currentThread().getName());
    }
}
class myThr2 extends Thread{
    public void run(){
        System.out.println("My priority is " +Thread.currentThread().getPriority());
        System.out.println("My name is " + Thread.currentThread().getName());
    }
}
public class question2 {
    public static void main(String[] args) {
        myThr1 myT1 = new myThr1();
        myT1.setPriority(9);
        myT1.start();
        System.out.println(myT1.getState());

        myThr2 myT2 = new myThr2();
        myT1.setPriority(8);
        myT2.start();
        System.out.println(myT2.getState());
    }   
}
