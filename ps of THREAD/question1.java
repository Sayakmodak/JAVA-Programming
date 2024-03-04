class myThr1 extends Thread{
    public void run(){
        int i=0;
        while(i<50){
            System.out.println("Good morning");
            i++;
        }
    }
}
class myThr2 extends Thread{
    public void run(){
        int i=0;
        while(i<50){
            try {
                Thread.sleep(4000);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Welcome");
            i++;
        }
    }
}
public class question1{
    public static void main(String[] args) {
        myThr1 myT1 = new myThr1();
        myT1.start();
        myThr2 myT2 = new myThr2();
        myT2.start();
    }
}